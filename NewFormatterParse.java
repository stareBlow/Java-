package Java基础库类;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by 孟晨 on 2017/6/11.
 */
public class NewFormatterParse {
    public static void main(String[] args) {
        // 定义一个任意格式的日期、时间字符串
        String str1 = "2017 06 11 01时 09分 11秒";
        // 根据需要解析的日期、时间字符串定义解析所用的格式器
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy MM dd HH时 mm分 ss秒");
        // 执行解析
        LocalDateTime dt1 = LocalDateTime.parse(str1, formatter1);
        System.out.println(dt1);
        // ------下面代码解析另一个字符串----
        String str2 = "2016$$$四月$$$13 20小时";
        DateTimeFormatter formatter2  = DateTimeFormatter.ofPattern("yyy$$$MMM$$$dd HH小时");
        LocalDateTime dt2 = LocalDateTime.parse(str2, formatter2);
        System.out.println(dt2);
//        String str2 = "2014$$$四月$$$13 20小时";
//        DateTimeFormatter fomatter2 = DateTimeFormatter
//                .ofPattern("yyy$$$MMM$$$dd HH小时");
//        LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
//        System.out.println(dt2); // 输出 2014-04-13T20:00
    }
}
