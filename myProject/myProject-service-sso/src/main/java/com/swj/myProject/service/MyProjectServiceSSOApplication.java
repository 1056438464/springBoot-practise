package com.swj.myProject.service;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class MyProjectServiceSSOApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyProjectServiceSSOApplication.class, args);
        Main.main(args);
    }
}
