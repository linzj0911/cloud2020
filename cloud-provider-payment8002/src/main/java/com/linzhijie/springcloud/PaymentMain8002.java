package com.linzhijie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-05 15:18
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient // 服务发现
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
