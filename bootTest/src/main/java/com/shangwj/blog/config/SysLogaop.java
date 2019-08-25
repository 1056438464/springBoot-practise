package com.shangwj.blog.config;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * aop
 */
@Aspect
@Component
public class SysLogaop {

    private Logger logger = LoggerFactory.getLogger(SysLogaop.class);

    @Autowired
    private mybatisfilter mybatisfilter1;

    @Pointcut("execution(public * com.shangwj.blog.mapper..*.*(..))")
    public void webLog(){}


    @After("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

//    @Before(value = "webLog1()")
//    public void exec(ProceedingJoinPoint invocation) throws Throwable {
//        Object result = invocation.proceed();
//        Object[] args = invocation.getArgs();
//        if (args.length > 0) {
//
//            logger.info("arges : " + args);
//        }
//    }

}
