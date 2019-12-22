package com.zjl.myblog.domain;


import com.zjl.myblog.error.ErrorConsts;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


/**
@author zjl
@description 角色实体类
@data 2019/10/30
*/
@Data
public class RoleDO implements Serializable {
    private static final long serialVersionUID = 8917044066759914275L;

    private Integer id;

    @NotNull(message = ErrorConsts.ROLE_PATTERN)
    private String roleName;

}
