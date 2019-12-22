package com.zjl.myblog.access;

import com.zjl.myblog.base.BaseRe;
import com.zjl.myblog.base.BaseRs;
import com.zjl.myblog.util.ValidatedUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/19
 * @date: 2019/12/19
 * @function: TODO
 */
public abstract class BaseAccessService<T extends BaseRe, E extends BaseRs> {

    @PostMapping
    public BaseRs post(@RequestBody @Validated T re, BindingResult result, @RequestHeader HttpHeaders headers, HttpServletRequest request) throws Exception {
        ValidatedUtil.getBindingResult ( result  );
        return handle(re,request,headers);
    }

    public abstract E handle(T request, HttpServletRequest httpRequest,@RequestHeader HttpHeaders headers) throws Exception;
}
