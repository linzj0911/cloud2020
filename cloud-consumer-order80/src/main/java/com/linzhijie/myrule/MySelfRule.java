package com.linzhijie.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-08 08:31
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();// 定义为随机
    }
}
