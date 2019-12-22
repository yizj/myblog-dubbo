package com.zjl.myblog.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/18
 * @date: 2019/12/18
 * @function: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRs implements Serializable {

    private static final long serialVersionUID = -1319543149003408304L;
    /**
     * SUCCESS_CODE:访问成功时的状态码.
     *
     */
    public transient static final String SUCCESS_CODE = "0";

    /**
     * resultCode:返回结果代码.
     *
     */
    private String resultCode;

    /**
     * reslutMessage:返回结果描述信息.
     *
     */
    private String resultMessage;
}
