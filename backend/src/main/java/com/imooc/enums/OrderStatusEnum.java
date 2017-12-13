package com.imooc.enums;

import lombok.Getter;


@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订�?),
    FINISHED(1, "完结"),
    CANCEL(2, "已取�?),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
