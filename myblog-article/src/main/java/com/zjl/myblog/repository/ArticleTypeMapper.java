package com.zjl.myblog.repository;

import com.zjl.myblog.domain.ArticleTypeDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/20
 * @date: 2019/12/20
 * @function: TODO
 */
@Mapper
public interface ArticleTypeMapper {

    int saveArticleType(ArticleTypeDO articleTypeDO);

    List<ArticleTypeDO> getArticleTypeByPid(ArticleTypeDO articleTypeDO);
}
