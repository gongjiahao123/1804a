package com.gongjiahao.util;

import java.util.Date;

//日期处理工具类
public class DateUtil {

    public static Date getDateByInitMonth(Date src){
        Date date = new Date();
        boolean b = date.equals(getDateByInitMonth(src));
        return date;
    }

    public static Date getDateByFullMonth(Date src){
        long time = src.getTime();
        if (time==0){
            return null;
        }
        return src;
    }

}
