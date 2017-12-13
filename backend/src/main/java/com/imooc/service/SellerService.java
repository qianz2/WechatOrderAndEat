package com.imooc.service;

import com.imooc.dataobject.SellerInfo;


public interface SellerService {

    /**
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
