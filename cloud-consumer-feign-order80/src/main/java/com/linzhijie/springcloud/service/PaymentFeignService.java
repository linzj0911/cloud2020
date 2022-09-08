package com.linzhijie.springcloud.service;

import com.linzhijie.springcloud.entities.CommonResult;
import com.linzhijie.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-08 08:08
 **/
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/create")
    CommonResult<Payment> create(Payment payment);

}
