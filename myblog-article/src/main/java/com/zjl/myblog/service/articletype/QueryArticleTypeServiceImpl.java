package com.zjl.myblog.service.articletype;

import com.zjl.myblog.domain.ArticleTypeDO;
import com.zjl.myblog.repository.ArticleTypeMapper;
import com.zjl.myblog.service.article.query.QueryArticleTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/20
 * @date: 2019/12/20
 * @function: TODO
 */
@Service
public class QueryArticleTypeServiceImpl implements QueryArticleTypeService {

    @Resource
    private ArticleTypeMapper articleTypeMapper;

    @Override
    public List<ArticleTypeDO> getArticleTypeByPid(ArticleTypeDO articleTypeDO) {
        return articleTypeMapper.getArticleTypeByPid ( articleTypeDO );
    }
}
