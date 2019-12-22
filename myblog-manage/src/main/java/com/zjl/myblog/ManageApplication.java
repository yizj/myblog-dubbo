package com.zjl.myblog;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author:jlzhang
 * @Description:
 * @Date:Created in 2019/12/16
 */
@SpringBootApplication
@EnableDubbo
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class);
    }
}
