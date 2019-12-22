package com.zjl.myblog.dto;

import com.zjl.myblog.vo.PageVO;
import lombok.Data;

import java.util.List;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/19
 * @date: 2019/12/19
 * @function: TODO
 */
@Data
public class PageInfoListResultDto<T> {

    private List<T> data;

    private PageVO pageVO;
}
