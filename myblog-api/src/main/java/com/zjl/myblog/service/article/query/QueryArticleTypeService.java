package com.zjl.myblog.service.article.query;

import com.zjl.myblog.domain.ArticleTypeDO;

import java.util.List;

public interface QueryArticleTypeService {

    List<ArticleTypeDO> getArticleTypeByPid(ArticleTypeDO articleTypeDO);
}
