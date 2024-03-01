package com.APi.uniapp.until;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LoaclDate {

    public static String getCurrentBeijingTime() {
        // 获取当前UTC时间
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        // 转换为中国北京时区的时间
        ZonedDateTime beijingTime = utcNow.withZoneSameInstant(ZoneId.of("Asia/Shanghai"));

        // 创建日期时间格式器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");

        // 格式化为字符串并返回
        return beijingTime.format(formatter);
    }
    public static void main(String[] args) {
        System.out.println(getCurrentBeijingTime());
    }

}
