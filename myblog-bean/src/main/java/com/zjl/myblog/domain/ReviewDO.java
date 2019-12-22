package com.zjl.myblog.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
@author zjl
@description 评论实体类
@data 2019/10/30
*/
@Data
@ToString
public class ReviewDO implements Serializable {
    private static final long serialVersionUID = -6888169019765149804L;


    private Integer id;

    /**
     * 被评论文章的ID
     */
    private Integer articleId;

    /**
     * 评论人的ID
     */
    private Integer masterId;

    private String reviewContent;

    private String reviewTime;

    private Integer authId;

}
