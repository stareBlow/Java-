package Java基础库类;
import java.util.*;
import static java.util.Calendar.*;
import java.util.Date;

/**
 * Created by 孟晨 on 2017/6/10.
 */
public class CalendarTest {
    public static void main(String[] args) {
        /*
        // 建一个默认的Calender对象
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        // 通过Date对象获取对应的calender对象
        // 因为Calendar/GregorianCalendar没有构造函数接受Date对象
        // 所以必须先获得一个Calendar实例，然后调用setTime()方法
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(date);
        */
        Calendar c = Calendar.getInstance();
        // 取出年
        System.out.println(c.get(YEAR));
        // 取出月
        System.out.println(c.get(MONTH));
        // 取出日
        System.out.println(c.get(DATE));
        // 分别设置年、月、日、小时、分钟、秒
        c.set(2003, 10, 23, 12, 32,23);
        System.out.println(c.getTime());
        // 将Calendar的年前推1年
        c.add(YEAR, -1);
        System.out.println(c.getTime());
        // 将Calendr的时间前推8个月
        c.add(MONTH, -8);
        System.out.println(c.getTime());
//        add与roll
        Calendar call = Calendar.getInstance();
        call.set(2003, 7, 23,0, 0, 0);
        call.add(MONTH, 6);
        System.out.println(call.getTime()); //Mon Feb 23 00:00:00 CST 2004
        Calendar ca12 = Calendar.getInstance();
        ca12.set(2003, 7, 31, 0 ,0 , 0);
        ca12.add(MONTH,6);
        // 因为月分改为2月，2月没有31日，自动变为29日
        System.out.println(ca12.getTime());// Sun Feb 29 00:00:00 CST 2004
        Calendar ca13 = Calendar.getInstance();
        ca13.set(2003, 7, 23,0, 0 ,0);
        // Month字段“进位”，但YEAR并不进位
        Calendar ca14 = Calendar.getInstance();
        ca14.set(2003, 7, 31, 0, 0 ,0);
        ca14.roll(MONTH, 6);
        System.out.println(ca14.getTime()); //套路与add相似
    }
}
