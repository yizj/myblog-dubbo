package com.zjl.myblog.controller;

import com.github.pagehelper.PageInfo;
import com.zjl.myblog.dto.ArticleDto;
import com.zjl.myblog.query.ArticleQuery;
import com.zjl.myblog.service.article.query.QureyArticleService;
import com.zjl.myblog.util.ValidatedUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/18
 * @date: 2019/12/18
 * @function: TODO
 */
@RestController
@Api(tags = "文章查询接口")
@RequestMapping("/article")
public class QueryArticleController {

    @Autowired
    private QureyArticleService qureyArticleService;

    @ApiOperation(value = "读取文章",notes = "get请求")
    @ApiImplicitParam(paramType = "path",required = true)
    @GetMapping()
    public ArticleDto getArticleById(@RequestParam(value = "id",required = false) Integer id){
        if(StringUtils.isEmpty ( id )){
            throw new RuntimeException ( "参数id不能为空" );
        }
        ArticleDto articleDto=qureyArticleService.getArticleById ( id );
        return articleDto;
    }

    @ApiOperation(value = "搜索文章",notes = "get请求")
    @ApiImplicitParam(paramType = "path",required = true)
    @GetMapping("/search")
    public PageInfo<ArticleDto> search(ArticleQuery articleQuery, BindingResult result) throws Exception {
        ValidatedUtil.getBindingResult ( result );
        PageInfo<ArticleDto> pageInfo=qureyArticleService.listArticleByKey ( articleQuery );
        return  pageInfo;
    }

    @ApiOperation(value = "按类别查看文章",notes = "get请求")
    @ApiImplicitParam(paramType = "path",required = true)
    @GetMapping("/type")
    public PageInfo<ArticleDto> type(ArticleQuery articleQuery) {
        PageInfo<ArticleDto> pageInfo=qureyArticleService.listArticleByType ( articleQuery );
        return  pageInfo;
    }
}
