package Java基础库类;

import java.util.Calendar;
import static java.util.Calendar.*;
/**
 * Created by 孟晨 on 2017/6/10.
 */
/*
set方法会延迟修改
多次修改时间时
会在调用get等方法时修改
0-11 分别代表1-12月

 */

public class LasyTest {
    public static void main(String[] args) {
        Calendar ca1 = Calendar.getInstance();
        ca1.set(2003, 7, 31);   //2003-8-31

        // 将月份设置为9，但9月31日不存在
        // 如果立即修改，系统会把ca1自动调整到10月1日
        ca1.set(MONTH, 8);
        // 下面的代码输出10月1日
//        System.out.println(ca1.getTime());
        // 设置DATE字段为5
        ca1.set(DATE, 5);
        System.out.println(ca1.getTime());
    }
}
