package com.linzhijie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-08 08:06
 **/
@SpringBootApplication
@EnableFeignClients // 开启OpenFeign
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
