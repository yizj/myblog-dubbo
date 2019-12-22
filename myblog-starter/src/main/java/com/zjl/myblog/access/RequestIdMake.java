package com.zjl.myblog.access;

import com.zjl.myblog.util.DateConsts;
import com.zjl.myblog.util.RandomUtil;
import com.zjl.myblog.view.ViewConsts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/20
 * @date: 2019/12/20
 * @function: TODO
 */
public class RequestIdMake {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DateConsts.Y_M_D_H_M );

    public static String generate() {
        LocalDateTime now = LocalDateTime.now();
        return String.format(ViewConsts.REQUESTID_FORMAT, now.format(DATE_TIME_FORMATTER), RandomUtil.random(ViewConsts.RANDOM_SIZE));
    }
}
