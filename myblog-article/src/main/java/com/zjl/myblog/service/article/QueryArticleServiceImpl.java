package com.zjl.myblog.service.article;


import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjl.myblog.dto.ArticleDto;
import com.zjl.myblog.dto.PageInfoListResultDto;
import com.zjl.myblog.query.ArticleQuery;
import com.zjl.myblog.repository.ArticleMapper;
import com.zjl.myblog.service.ServiceConsts;
import com.zjl.myblog.service.article.query.QureyArticleService;
import com.zjl.myblog.service.redis.RedisService;
import com.zjl.myblog.util.RedisUtil;
import com.zjl.myblog.view.ViewConsts;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@Service
public class QueryArticleServiceImpl implements QureyArticleService {

    @Resource
    private transient ArticleMapper articleMapper;

    @Reference
    private transient RedisService redisService;

    @Transactional
    @Override
    public ArticleDto getArticleById(Integer id) {
        ArticleDto articleDto=articleMapper.findArticleById ( id );
        if (articleDto != null) {
            articleDto.setResultCode ( ViewConsts.SUCCESS_CODE );
            articleDto.setResultMessage ( "查看文章成功" );
        }
        articleDto.getArticleDO ().setArticleCount (articleDto.getArticleDO ().getArticleCount ()+1);
        int res=articleMapper.updateArticle ( articleDto.getArticleDO () );
        if (res==1) {
            //更新redis
            String key=RedisUtil.getKey ( Arrays.asList ( ServiceConsts.ARTICLE_OBJECT_TYPE,
                    id.toString () ,
                    ServiceConsts.ARTICLE_OBJECT_PROPERTY));
            redisService.increment ( key,1 );
        }
        return articleDto;
    }

    @Override
    public PageInfoListResultDto listArticleByTime(ArticleQuery articleQuery) {
        return null;
    }

    @Override
    public PageInfo<ArticleDto> listArticleByKey(ArticleQuery articleQuery) {
        PageHelper.startPage ( articleQuery.getPageVO ().getPage (),
                articleQuery.getPageVO ().getSize () );
        List<ArticleDto> articleDtos=articleMapper.listArticleByContentAndTitle ( articleQuery );
        PageInfo<ArticleDto> pageInfo=new PageInfo<> ( articleDtos );
        return pageInfo;
    }

    @Override
    public PageInfo<ArticleDto> listArticleByType(ArticleQuery articleQuery) {
        PageHelper.startPage ( articleQuery.getPageVO ().getPage (),
                articleQuery.getPageVO ().getSize () );
        List<ArticleDto> articles=articleMapper.listArticleByType ( articleQuery );
        PageInfo<ArticleDto> pageInfo=new PageInfo<> ( articles );
        return pageInfo;
    }
}
