package com.web;/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 *
 * @author yinbing.qiu
 * @create 2018-07-20 15:05
 **/

@ServletComponentScan
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableSwagger2
@ComponentScan(basePackages = {"com.web"})
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Application.class);
    }

}
