package com.linzhijie.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description
 * @author: linzj
 * @create: 2022-09-06 09:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;
    private String msg;
    private T data;

    public CommonResult(int code,String msg){
        this(code,msg,null);
    }
}
