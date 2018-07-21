/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */
package com.web.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @FileName: APIResult.java
 * @Description: APIResult.java类说明
 * @Author: yinbing.qiu
 * @Date: 2018/7/18 20:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = -6629012691534400264L;
    private Boolean success;
    private T data;
    private String msg;

    public static <T> ApiResult getSuccess(T data) {
        return new ApiResult(true, data, null);

    }

    public static ApiResult getFailed(String msg) {
        return new ApiResult(false, null, msg);
    }
}
