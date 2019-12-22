package com.zjl.myblog.dto;

import com.zjl.myblog.base.BaseRs;
import com.zjl.myblog.domain.ArticleDO;
import com.zjl.myblog.domain.ArticleTypeDO;
import com.zjl.myblog.domain.UserDO;
import lombok.Data;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/12
 * @date: 2019/12/12
 * @function: TODO
 */
@Data
public class ArticleDto extends BaseRs {

    private ArticleDO articleDO;

    private UserDO userDO;

    private ArticleTypeDO articleTypeDO;

}
