package com.linzhijie.springcloud.controller;

import com.linzhijie.springcloud.entities.CommonResult;
import com.linzhijie.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-06 09:23
 **/
@RestController
@RequestMapping("consumer")
public class OrderController {

//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
//        return restTemplate.postForObject(PAYMENT_SRV + "/payment/create",payment,CommonResult.class);
        return restTemplate.postForEntity(PAYMENT_SRV + "/payment/create",payment,CommonResult.class).getBody();
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
//        return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/" + id,CommonResult.class);
        return restTemplate.getForEntity(PAYMENT_SRV + "/payment/get/" + id,CommonResult.class).getBody();
    }


}
