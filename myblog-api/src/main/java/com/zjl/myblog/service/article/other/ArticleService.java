package com.zjl.myblog.service.article.other;

import com.zjl.myblog.domain.ArticleDO;

import javax.servlet.http.HttpServletRequest;


public interface ArticleService {

     void addArticle(ArticleDO article, HttpServletRequest request) throws Exception;

}
