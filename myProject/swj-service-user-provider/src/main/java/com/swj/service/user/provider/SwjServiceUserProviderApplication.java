package com.swj.service.user.provider;

import com.alibaba.dubbo.container.Main;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.swj")
@EnableTransactionManagement
@MapperScan(basePackages = "com.swj.commons.mapper")
public class SwjServiceUserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwjServiceUserProviderApplication.class,args);
        Main.main(args);
    }
}
