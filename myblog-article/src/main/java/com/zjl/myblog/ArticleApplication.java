package com.zjl.myblog;

/**
 * @Author:jlzhang
 * @Description:
 * @Date:Created in 2019/12/16
 */

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.zjl.myblog.repository")
@ServletComponentScan(basePackages = "com.zjl.myblog.filter")
public class ArticleApplication {

    public static void main(String[] args){
        SpringApplication.run(ArticleApplication.class);
    }
}
