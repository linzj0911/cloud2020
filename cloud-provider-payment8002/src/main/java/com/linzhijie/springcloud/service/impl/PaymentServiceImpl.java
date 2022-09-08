package com.linzhijie.springcloud.service.impl;

import com.linzhijie.springcloud.dao.PaymentDao;
import com.linzhijie.springcloud.entities.Payment;
import com.linzhijie.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-05 15:50
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
