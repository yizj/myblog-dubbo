package com.zjl.myblog.util;

/**
 * @author JLZHANG
 * @version 5.1.0 2019/12/20
 * @date: 2019/12/20
 * @function: TODO
 */
public class RandomUtil {

    public static String random(int number) {
        int n = number / 8;
        int remainder = number % 8;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < n; ++i) {
            random(8, stringBuilder);
        }

        if (remainder != 0) {
            random(remainder, stringBuilder);
        }

        return stringBuilder.toString();
    }

    private static void random(int number, StringBuilder stringBuilder) {
        String string = Integer.toString((int)(Math.random() * Math.pow(10.0D, (double)number)));
        int length = string.length();

        for(int j = 0; j < number - length; ++j) {
            stringBuilder.append("0");
        }

        stringBuilder.append(string);
    }
}
