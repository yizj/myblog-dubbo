package com.zjl.myblog.repository;

import com.zjl.myblog.domain.ArticleDO;
import com.zjl.myblog.dto.ArticleDto;
import com.zjl.myblog.query.ArticleQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:jlzhang
 * @Description:
 * @Date:Created in 2019/12/16
 */
@Mapper
public interface ArticleMapper{

    ArticleDto findArticleById(Integer id);

    int updateArticle(ArticleDO articleDO);

    int saveArticle(ArticleDO articleDO);

    List<ArticleDto> listArticleByTime(ArticleDto articleDto);

    List<ArticleDto> listArticleByContentAndTitle(ArticleQuery articleQuery);

    List<ArticleDto> listArticleByType(ArticleQuery articleQuery);
}
