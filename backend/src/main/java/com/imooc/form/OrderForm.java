package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;


    @NotEmpty(message = "手机号必�?)
    private String phone;


    @NotEmpty(message = "地址必填")
    private String address;


    @NotEmpty(message = "openid必填")
    private String openid;


    @NotEmpty(message = "购物车不能为�?)
    private String items;
}
