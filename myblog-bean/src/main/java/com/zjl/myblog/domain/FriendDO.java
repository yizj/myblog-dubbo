package com.zjl.myblog.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
@author zjl
@description 好友实体类
@data 2019/10/30
*/
@Data
@ToString
public class FriendDO implements Serializable {
    private static final long serialVersionUID = 5591440628416674493L;


    private Integer id;

    /**
     * 关注的朋友的id
     */
    private Integer friendMasterId;

    /**
     * 博主自己的ID
     */
    private Integer friendId;

    private String friendMemoName;

}
