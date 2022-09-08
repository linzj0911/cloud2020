package com.linzhijie.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService{
    String paymentInfo_OK(Integer id);
    String paymentInfo_TimeOut(Integer id);
    String paymentInfo_TimeOutHandler(Integer id);
    String paymentCircuitBreaker(@PathVariable("id") Integer id);
    String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id);
}