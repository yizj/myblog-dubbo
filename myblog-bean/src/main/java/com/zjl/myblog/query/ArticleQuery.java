package com.zjl.myblog.query;

import com.zjl.myblog.dto.ArticleDto;
import com.zjl.myblog.vo.PageVO;
import lombok.Data;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/19
 * @date: 2019/12/19
 * @function: TODO
 */
@Data
public class ArticleQuery {

    private PageVO pageVO;

    private ArticleDto articleDto;

    private String key;
}
