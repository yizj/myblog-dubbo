package com.zjl.myblog.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zjl
 * @description 照片
 * @data 2019/10/30
 */
@ToString
@Data
public class PhotoDO implements Serializable {
    private static final long serialVersionUID = 8493191393416980345L;


    private Integer id;

    private String photoAddr;

    private String photoSendTime;

    private String photoInfo;

    private Integer masterId;

}
