package com.zjl.myblog.domain;

import com.zjl.myblog.base.BaseRe;
import com.zjl.myblog.error.ErrorConsts;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author zjl
 * @description 文章类型
 * @data 2019/10/30
 */

@Data
public class ArticleTypeDO extends BaseRe implements Serializable {
    private static final long serialVersionUID = -2459104959437545431L;

    private Integer id;

    private Integer pid;

    @NotEmpty(message = ErrorConsts.ARTICLETYPE_NAME)
    @NotNull(message = ErrorConsts.ARTICLETYPE_NAME)
    private String articleTypeName;

    private String articleTypeDesc;
}
