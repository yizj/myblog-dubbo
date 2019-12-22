package com.zjl.myblog.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.zjl.myblog.error.ErrorConsts;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zjl
 * @description 用户实体映射类
 * @data 2019/10/30
 */

@Data
@ToString(exclude = {"roles"})
public class UserDO implements Serializable {

    private static final long serialVersionUID = -7629523597327671712L;


    private Integer id;

    @NotNull(message = ErrorConsts.USER_NAME_NOTNULL)
    @Size(min = 6, max = 20, message = ErrorConsts.USER_NAME_SIZE)
    private String userName;

    private String userPwd;

    @Email(message = ErrorConsts.EMAIL_PATTERN)
    @NotNull(message = ErrorConsts.EMAIL_NOTNULL)
    private String userEmail;

    @NotNull(message = ErrorConsts.PHONE_NOTNULL)
    @Pattern(regexp = "^[1][3-9][0-9]{9}$", message = ErrorConsts.PHONE_PATTERN)
    private String userPhone;

}
