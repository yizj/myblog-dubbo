package com.zjl.myblog.domain;

import lombok.Data;
import java.io.Serializable;

/**
 * @author zjl
 * @description 权限类
 * @data 2019/10/30
 */

@Data
public class ActionDO implements Serializable {

    private static final long serialVersionUID = -4966720157938737838L;

    private Integer id;

    private String actionUrl;

    private String actionGroupId;

    private String actionName;

}
