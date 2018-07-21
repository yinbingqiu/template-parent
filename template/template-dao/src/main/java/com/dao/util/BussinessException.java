/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */
package com.dao.util;


import com.dao.constant.ErrorMessage;

/**
 * @Description: 业务异常类
 * @Author: jianpo.zhao
 * @Date: 2018/6/13 14:31
 */
public class BussinessException extends RuntimeException {
    private Integer code;//标准编码，用于根据编码查询错误信息

    public BussinessException() {
        super();
    }

    public BussinessException(String message) {
        super(message);
    }

    public BussinessException(Integer code) {
        super();
        this.code = code;
    }

    public BussinessException(ErrorMessage.ExceptionConstant error) {
        super(error.message());
        this.code = error.code();
    }


}
