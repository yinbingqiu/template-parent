/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */
package com.dao.constant;

/**
 * @FileName: ErrorMessage.java
 * @Description: ErrorMessage.java类说明
 * @Author: yinbing.qiu
 * @Date: 2018/7/18 20:03
 */
public interface ErrorMessage {
    /*exception checked:代表系统已检查型异常前缀*/
    String PREFIX = "ec-";

    interface System {
        String INTERNAL_SERVER = "系统异常";

        ExceptionConstant SYSTEM_EXCEPTION = new ExceptionConstant(0, "系统异常");
    }

    class ExceptionConstant {
        private Integer code;
        private String message;

        ExceptionConstant(Integer code, String message) {
            this.message = PREFIX + message;
            this.code = code;
        }

        public Integer code() {
            return code;
        }

        public String message() {
            return message;
        }
    }

}
