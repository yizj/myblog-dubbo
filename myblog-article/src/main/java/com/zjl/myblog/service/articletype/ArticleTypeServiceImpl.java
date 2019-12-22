package com.zjl.myblog.service.articletype;

import com.zjl.myblog.domain.ArticleTypeDO;
import com.zjl.myblog.repository.ArticleTypeMapper;
import com.zjl.myblog.service.article.other.ArticleTypeService;
import com.zjl.myblog.service.article.query.QueryArticleTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/20
 * @date: 2019/12/20
 * @function: TODO
 */
@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Resource
    private ArticleTypeMapper articleTypeMapper;

    @Resource
    private QueryArticleTypeService queryArticleTypeService;

    @Override
    public void addArticleType(ArticleTypeDO articleType){

        int res=queryArticleTypeService.getArticleTypeByPid ( articleType ).size ();
        if(res==0){
            articleType.setPid ( 0 );
        }
        if(articleTypeMapper.saveArticleType ( articleType )==0){
            throw new RuntimeException ( "添加类别失败" );
        }
    }
}
