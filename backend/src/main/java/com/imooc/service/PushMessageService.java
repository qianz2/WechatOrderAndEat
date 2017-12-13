package com.imooc.service;

import com.imooc.dto.OrderDTO;


public interface PushMessageService {
    void orderStatus(OrderDTO orderDTO);
}
