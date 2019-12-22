package com.zjl.myblog.service.article.query;

import com.github.pagehelper.PageInfo;
import com.zjl.myblog.dto.ArticleDto;
import com.zjl.myblog.dto.PageInfoListResultDto;
import com.zjl.myblog.query.ArticleQuery;

public interface QureyArticleService {

    ArticleDto getArticleById(Integer id);

    PageInfoListResultDto listArticleByTime(ArticleQuery articleQuery);

    PageInfo<ArticleDto> listArticleByKey(ArticleQuery articleQuery);

    PageInfo<ArticleDto> listArticleByType(ArticleQuery articleQuery);
}
