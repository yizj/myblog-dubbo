package com.zjl.myblog.vo;

import com.zjl.myblog.view.ViewConsts;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/12
 * @date: 2019/12/12
 * @function: TODO
 */
@Data
public class PageVO {

    @NotNull(message = ViewConsts.PAGE_SIZE)
    @NotEmpty(message = ViewConsts.PAGE_SIZE)
    private Integer size;

    @NotNull(message =ViewConsts.PAGE_NUM)
    @NotEmpty(message =ViewConsts.PAGE_NUM)
    private Integer page;

    private Integer totalPage;

    private Long totalSize;
}
