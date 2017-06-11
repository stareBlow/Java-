package Java基础库类;

import java.util.*;

/**
 * Created by 孟晨 on 2017/6/10.
 */
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        // 获取当前时间之后的100ms时间
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.before(d2));
    }
}
