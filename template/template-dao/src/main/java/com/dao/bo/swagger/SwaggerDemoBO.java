package com.dao.bo.swagger;/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Administrator
 * @create 2018-07-20 16:23
 **/
@ApiModel
@Data
public class SwaggerDemoBO {

    @ApiModelProperty(value = "用户名", required = true)
    private String userName;
    @ApiModelProperty(value = "邮箱", required = true)
    private String email;
    @ApiModelProperty(value = "手机", required = true)
    private String phone;
    @ApiModelProperty(value = "今天周几", example = "THUS", allowableValues = "MON,TUE,WEN,THUS,FRI,SAT,SUN", required = true)
    private String date;

}
