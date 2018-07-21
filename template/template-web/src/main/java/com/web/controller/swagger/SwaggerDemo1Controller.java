package com.web.controller.swagger;/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

import com.dao.bo.swagger.SwaggerDemoBO;
import com.dao.dto.swagger.SwaggerDemoDTO;
import com.dao.dto.swagger.SwaggerDemoDTO1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swagger使用Demo
 *
 * @author Administrator
 * @create 2018-07-20 15:09
 **/
@Api("测试Swagger2Demo 2")
@RestController("/swagger1")
public class SwaggerDemo1Controller {
    @ApiOperation("测试返回值")
    @RequestMapping(value = "test1", method = RequestMethod.POST)
    public SwaggerDemoDTO test1() {
        return new SwaggerDemoDTO("xxxx.xxx", "xxxx@sina.com", "11111111111");
    }

    @ApiOperation("测试不同的入参方式")
    @RequestMapping(value = "test2/{bb}", method = RequestMethod.PUT)
    public SwaggerDemoDTO1 test2(@ApiParam SwaggerDemoBO bo) {
        return new SwaggerDemoDTO1("yinbing.xxxx", "xxxxx@sina.com", "11111111111");
    }

}
