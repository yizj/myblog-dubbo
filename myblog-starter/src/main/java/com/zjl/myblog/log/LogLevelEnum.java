package com.zjl.myblog.log;

public enum LogLevelEnum {

    /**
     * ACCESS:接入用户请求的概要信息.
     *
     */
    ACCESS("ACCESS"),
    /**
     * IN:用户请求和请求返回的ELK日志动作
     *
     */
    IN("IN"),
    /**
     * OUT:请求外系统和外系统返回的ELK日志.
     *
     */
    OUT("OUT"),
    /**
     * STEP:系统内关键步骤的ELK日志.
     *
     */
    STEP("STEP"),
    /**
     * IO:系统访问IO设备或者访问数据库，缓存的ELK日志.
     *
     */
    IO("IO"),
    /**
     * ERROR:错误信息的日志.
     *
     */
    ERROR("ERROR"),
    /**
     * DEBUG:DEBUG信息的日志.
     *
     */
    DEBUG("DEBUG");

    LogLevelEnum(String debug) {
    }
}
