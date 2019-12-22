package com.zjl.myblog.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zjl
 * @description 留言类
 * @data 2019/10/30
 */

@Data
@ToString
public class WordDO implements Serializable {
    private static final long serialVersionUID = -4691455148481647443L;

    private Integer id;

    private String wordTitle;

    private String wordContent;

    private String wordSendTime;

    private Integer wordMasterId;

    private Integer wordAuthid;
}
