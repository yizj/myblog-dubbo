package com.zjl.myblog.util;

import com.zjl.myblog.dto.PageInfoListResultDto;
import com.zjl.myblog.vo.PageVO;

import java.util.List;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/19
 * @date: 2019/12/19
 * @function: TODO
 */
public class PageUtil {

    public static <T> PageInfoListResultDto<T> makePageListResult(PageVO pageVO, List<T> data) {
        PageInfoListResultDto<T> pageInfoListResultDto = new PageInfoListResultDto<> ();
        pageInfoListResultDto.setData ( data );
        return pageInfoListResultDto;
    }

}
