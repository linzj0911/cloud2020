package com.linzhijie.springcloud.cfconfig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-08 08:25
 **/
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
