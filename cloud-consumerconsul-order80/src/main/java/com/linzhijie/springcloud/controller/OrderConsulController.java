package com.linzhijie.springcloud.controller;

import com.linzhijie.springcloud.entities.CommonResult;
import com.linzhijie.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-07 15:13
 **/
@RestController
public class OrderConsulController
{
    public static final String INVOKE_URL = "http://consul-provider-payment"; //consul-provider-payment

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul", String.class);
        System.out.println("消费者调用支付服务(consul)--->result:" + result);
        return result;
    }

    @GetMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
//        return restTemplate.postForObject(INVOKE_URL + "/payment/create",payment,CommonResult.class);
        return restTemplate.postForEntity(INVOKE_URL + "/payment/create",payment, CommonResult.class).getBody();
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
//        return restTemplate.getForObject(INVOKE_URL + "/payment/get/" + id,CommonResult.class);
        return restTemplate.getForEntity(INVOKE_URL + "/payment/get/" + id,CommonResult.class).getBody();
    }
}
