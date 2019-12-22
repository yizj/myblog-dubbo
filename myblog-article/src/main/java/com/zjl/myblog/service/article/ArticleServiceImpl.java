package com.zjl.myblog.service.article;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjl.myblog.domain.ArticleDO;
import com.zjl.myblog.dto.UserDto;
import com.zjl.myblog.repository.ArticleMapper;
import com.zjl.myblog.service.ServiceConsts;
import com.zjl.myblog.service.article.other.ArticleService;
import com.zjl.myblog.service.redis.RedisService;
import com.zjl.myblog.util.*;
import com.zjl.myblog.view.ViewConsts;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/17
 * @date: 2019/12/17
 * @function: TODO
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private transient ArticleMapper articleMapper;

    @Reference
    private transient RedisService redisService;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void addArticle(ArticleDO article, HttpServletRequest request) {
        String resToken="";
        UserDto userDto=null;
        article.setArticleSendTime ( DateFormatUtil.getCurrentTime ( DateConsts.Y_M_D_HMS ) );
        String token= CookieUtil.getCookie ( request, ViewConsts.TOKEN );
        if(StringUtils.isEmpty ( token )){
            resToken=CookieUtil.getCookie ( request );
        }
        else {
            userDto= JsonClassConvertUtil.stringToBean ( redisService.get ( token ), UserDto.class );
        }
        if (userDto != null) {
            article.setArticleAuthId ( userDto.getId () );
            article.setArticleFrom ( userDto.getUserName () );
        }
        else {
            article.setArticleAuthId(0);
            article.setArticleFrom(resToken);
        }
        // 文章发布初，数量为0
        article.setArticleCount ( 0 );
        int resArticle = articleMapper.saveArticle (article);
        if(resArticle==0){
            throw new RuntimeException ( "发表文章失败" );
        }
        // redis设置文章阅读数量
        String key= RedisUtil.getKey ( Arrays.asList ( ServiceConsts.ARTICLE_OBJECT_TYPE,
                article.getId ().toString () ,
                ServiceConsts.ARTICLE_OBJECT_PROPERTY));
        redisService.set ( key,article.getArticleCount ().toString () );
    }
}
