package com.dao.dto.swagger;/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 测试bean
 *
 * @author Administrator
 * @create 2018-07-20 15:15
 **/
@ApiModel
@Data
@AllArgsConstructor
public class SwaggerDemoDTO1 {
    //    value:描述，example：值的示例，require：属性是否必须
    @ApiModelProperty(value = "属性的简短描述", example = "属性的示例值", required = true, allowableValues = "123,456,789")
    private String userName;
    @ApiModelProperty(value = "邮箱", example = "属性的示例值", required = true)
    private String email;
    @ApiModelProperty(value = "手机", example = "属性的示例值", required = true)
    private String phone;
}
