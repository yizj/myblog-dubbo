package com.zjl.myblog.repository;

import com.zjl.myblog.domain.ArticleDO;
import com.zjl.myblog.dto.ArticleDto;
import com.zjl.myblog.query.ArticleQuery;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class ArticleMapperTest {

    @Resource
    private ArticleMapper articleMapper;

    @Test
    void findArticleById() {
        ArticleDto articleDto=articleMapper.findArticleById ( 6 );
        Assert.assertTrue ( articleDto.getUserDO ()!=null );
    }

    @Test
    void listArticleByTime() {
        //give
        ArticleDto articleDto=new ArticleDto ();
        ArticleDO articleDO=new ArticleDO ();
        articleDO.setArticleSendTime ( "1" );
        articleDto.setArticleDO ( articleDO );
        List<ArticleDto> res=articleMapper.listArticleByTime ( articleDto );
        Assert.assertTrue ( res.size ()>0 );
    }

    @Test
    void listArticleByContentAndTitle() {
        ArticleQuery articleQuery=new ArticleQuery ();
        articleQuery.setKey ( "s" );
        List<ArticleDto> res=articleMapper.listArticleByContentAndTitle ( articleQuery );
        Assert.assertTrue ( res.size ()>0 );
    }
}