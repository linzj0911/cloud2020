package com.linzhijie.springcloud.controller;

import com.linzhijie.springcloud.entities.CommonResult;
import com.linzhijie.springcloud.entities.Payment;
import com.linzhijie.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-08 08:13
 **/
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return paymentFeignService.create(payment);
    }

}

