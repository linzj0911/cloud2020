package com.linzhijie.springcloud.dao;

import com.linzhijie.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-05 15:22
 **/
@Mapper
public interface PaymentDao {

    /**
     * @description 新增支付订单
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * @desciption 根据id查询支付订单
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);

}
