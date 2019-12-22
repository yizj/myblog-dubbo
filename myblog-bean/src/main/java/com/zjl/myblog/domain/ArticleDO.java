package com.zjl.myblog.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zjl.myblog.base.BaseRe;
import com.zjl.myblog.error.ErrorConsts;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zjl
 * @description 文章实体类
 * @data 2019/10/30
 */
@Data
@ToString
public class ArticleDO extends BaseRe implements Serializable {
    private static final long serialVersionUID = -3673908236045108562L;

    @JsonIgnore
    private Integer id;

    @JsonIgnore
    private Integer articleTypeId;

    @NotNull(message = ErrorConsts.ARTICLE_TITLE)
    @NotEmpty(message = ErrorConsts.ARTICLE_TITLE)
    private String articleTitle;

    @NotNull(message = ErrorConsts.ARTICLE_CONTENT)
    @NotEmpty(message =ErrorConsts.ARTICLE_CONTENT )
    private String articleContent;

    @JsonIgnore
    private String articleSendTime;

    @JsonIgnore
    private Integer articleAuthId;

    /**
     * 文章阅读数
     */
    @JsonIgnore
    private Integer articleCount;

    /**
     * 文章来源
     */
    @JsonIgnore
    private String articleFrom;

    private String articleInfo;

}
