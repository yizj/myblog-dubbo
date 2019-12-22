package com.zjl.myblog.error;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/12
 * @date: 2019/12/12
 * @function: TODO
 */
public class ErrorConsts {
    /**
     * role验证消息
     */
    public static final String ROLE_PATTERN = "角色名不能为空";
    /**
     * user验证消息
     */
    public static final String USER_NAME_NOTNULL = "用户名不能为空";

    public static final String USER_NAME_SIZE = "用户名应该在六位与二十位之间";

    public static final String EMAIL_NOTNULL = "邮箱不能为空";

    public static final String EMAIL_PATTERN = "邮箱格式不正确";

    public static final String PHONE_NOTNULL = "手机号码不能为空";

    public static final String PHONE_PATTERN = "手机号码格式不正确";

    public static final String ARTICLE_TITLE = "文章标题不能为空";

    public static final String ARTICLE_CONTENT = "文章内容不能为空";

    public static final String ARTICLETYPE_NAME = "类别名称不能为空";


}
