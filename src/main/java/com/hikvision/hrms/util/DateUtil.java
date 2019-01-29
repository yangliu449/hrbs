package com.hikvision.hrms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 * f辅助类
 *  getDate() 方法的作用是返回格式化的当前日期
 */
public class DateUtil {
    public static Date getDate() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(sdf.format(date));
    }

}
