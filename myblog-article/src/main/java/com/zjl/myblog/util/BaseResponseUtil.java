package com.zjl.myblog.util;

import com.zjl.myblog.base.BaseRs;
import com.zjl.myblog.view.ViewConsts;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/18
 * @date: 2019/12/18
 * @function: TODO
 */
public class BaseResponseUtil {

    public static BaseRs success(String message){
        BaseRs baseRs=new BaseRs (ViewConsts.SUCCESS_CODE ,message);
        return baseRs;
    }

    public static BaseRs error(String message){
        BaseRs baseRs=new BaseRs (ViewConsts.ERROR_CODE ,message);
        return baseRs;
    }
}
