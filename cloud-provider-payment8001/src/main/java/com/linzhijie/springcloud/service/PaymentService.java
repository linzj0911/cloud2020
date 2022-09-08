package com.linzhijie.springcloud.service;

import com.linzhijie.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-05 15:50
 **/
public interface PaymentService {

    /**
     * @description 新增支付订单
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * @desciption 根据id查询支付订单
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id);

}
