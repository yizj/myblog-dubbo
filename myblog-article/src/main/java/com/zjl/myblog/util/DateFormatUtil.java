package com.zjl.myblog.util;


import java.text.SimpleDateFormat;


/**
 * @Author:jlzhang
 * @Description:
 * @Date:Created in 2019/10/30
 */
public class DateFormatUtil {


    public static String getCurrentTime(String parrent){

        long now=System.currentTimeMillis ();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat ( parrent );
        return simpleDateFormat.format ( now );

    }

}
