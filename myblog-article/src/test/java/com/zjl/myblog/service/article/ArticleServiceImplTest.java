package com.zjl.myblog.service.article;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith (SpringRunner.class)
class ArticleServiceImplTest {

    @Autowired
    private transient QueryArticleServiceImpl articleService;

    @Test
    void getArticleById() {
        articleService.getArticleById ( 1 );
    }
}