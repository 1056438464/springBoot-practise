package com.swj.service.user.consumer;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.swj")
public class SwjServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwjServiceUserConsumerApplication.class, args);
        Main.main(args);
    }
}
