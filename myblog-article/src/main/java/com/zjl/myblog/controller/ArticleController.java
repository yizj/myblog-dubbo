package com.zjl.myblog.controller;


import com.zjl.myblog.access.BaseAccessService;
import com.zjl.myblog.base.BaseRs;
import com.zjl.myblog.domain.ArticleDO;
import com.zjl.myblog.service.article.other.ArticleService;
import com.zjl.myblog.util.BaseResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api(tags = "文章接口")
@RequestMapping("/article")
public class ArticleController extends BaseAccessService<ArticleDO,BaseRs> {

    @Autowired
    private ArticleService articleService;


    @ApiOperation(value = "发布文章",notes = "post请求")
    @ApiImplicitParam(paramType = "path",required = true)
    @Override
    public BaseRs handle(ArticleDO request, HttpServletRequest httpRequest, HttpHeaders headers) throws Exception {
        articleService.addArticle ( request,httpRequest );
        return  BaseResponseUtil.success("文章发布成功");
    }
}
