package com.bingo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bingo on 2019/6/15
 */
public class DateUtils {

    /**
     * Date转String
     * @param date
     * @param str
     * @return
     */
    public static String date2String(Date date, String str){
        SimpleDateFormat dateFormat = new SimpleDateFormat(str);
        String format = dateFormat.format(date);
        return format;
    }
    //字符串转换成日期
    public Date string2Date(String daistring ,String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        Date date = simpleDateFormat.parse(daistring);
        return date;
    }
}
