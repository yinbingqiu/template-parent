package com.web.controller.swagger;/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

import com.dao.bo.swagger.SwaggerDemoBO;
import com.dao.dto.swagger.SwaggerDemoDTO;
import com.dao.dto.swagger.SwaggerDemoDTO1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.websocket.server.PathParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swagger使用Demo
 *
 * @author Administrator
 * @create 2018-07-20 15:09
 **/
@Api("测试Swagger2Demo 1")
@RestController("/swagger")
public class SwaggerDemoController {
    @ApiOperation("测试返回值")
    @RequestMapping(value = "test11", method = RequestMethod.GET)
    public SwaggerDemoDTO test1() {
        return new SwaggerDemoDTO("dalao", "xxxx@sina.com", "11111111111");
    }

    /**
     * @param bo
     * @param bb
     * @return
     */
    @ApiOperation("测试不同的入参方式")
    @RequestMapping(value = "test12/{bb}", method = RequestMethod.DELETE)
    public SwaggerDemoDTO1 test2(@Validated @ApiParam SwaggerDemoBO bo, @PathVariable @PathParam("bb") String bb) {
        return new SwaggerDemoDTO1("dalao", "xxxxx@sina.com", "11111111111");
    }

}
