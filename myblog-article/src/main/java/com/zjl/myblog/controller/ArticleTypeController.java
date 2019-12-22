package com.zjl.myblog.controller;

import com.zjl.myblog.access.BaseAccessService;
import com.zjl.myblog.base.BaseRs;
import com.zjl.myblog.domain.ArticleTypeDO;
import com.zjl.myblog.service.article.other.ArticleTypeService;
import com.zjl.myblog.util.BaseResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/20
 * @date: 2019/12/20
 * @function: TODO
 */
@RestController
@Api(tags = "文章类别接口")
@RequestMapping("type")
public class ArticleTypeController extends BaseAccessService<ArticleTypeDO,BaseRs> {

    @Autowired
    private ArticleTypeService articleTypeService;

    @ApiOperation(value = "文章类别添加",notes = "post请求")
    @ApiImplicitParam(paramType = "path",required = true)
    @Override
    public BaseRs handle(ArticleTypeDO request, HttpServletRequest httpRequest, HttpHeaders headers) throws Exception {
        articleTypeService.addArticleType ( request );
        return  BaseResponseUtil.success("文章类别添加成功");
    }
}
