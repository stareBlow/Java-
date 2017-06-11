package Java基础库类;

import java.time.*;

/**
 * Created by 孟晨 on 2017/6/11.
 */
public class NewDatePackageTest {
    public static void main(String[] args) {
        // -----------下面是关于Clock的用法---------
        // 获取当前的Clock
        Clock clock = Clock.systemUTC();
        // 通过Clock获取当前的时刻
        System.out.println("当前的时刻为：" + clock.instant());
        // 获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
        // 下面是Duration的用法
        Duration d = Duration.ofSeconds(6000);
        System.out.println("六千秒相当于" + d.toMinutes() + "分");
        System.out.println("六千秒相当于" + d.toHours() + "小时");
        System.out.println("六千秒相当于" + d.toDays() + "天");
        // 在clock基础上加6000秒，返回新的clock
        Clock clock2 = Clock.offset(clock, d);
        // 可以看到clock 与clock2相差1小时40分钟
        System.out.println("当前时刻加6000秒为：" + clock2.instant());
        // 下面是关于Instant的用法-------
        //获取当前的时间
        Instant instant = Instant.now();
        System.out.println(instant);
        // instance添加6000秒，返回新的Instance
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);
        // 根据字符串解析Instance现象
        Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
        System.out.println(instant3);
        // 在instance3基础上加5小时4分钟
        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        // 获取instance45天天前的时间
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);
        // -----下面是关于LocalTime的用法------
        // 获取当前时间
        LocalTime localTime = LocalTime.now();
        // 设置时间为22点33分
        localTime = LocalTime.of(22, 33);
        System.out.println(localTime);
        // 返回第一天中的第5503秒
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);  //01:31:43
        // -----下面是LocaleDateTime 的用法-------
        LocalDateTime localDateTime = LocalDateTime.now();
        // 当前的时间加上25小时3分钟
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("当前日期、时间的25小时3分之后：" + future);
        // -----下面是关于Year、YearMonth、MonthDay的用法示例-----
        Year year = Year.now(); // 获取当前的年份
        System.out.println("当前的年份：" + year);
        year = year.plusYears(5);   // 当前年份再加5年
        System.out.println("当前年份再过5年：" + year);
        // 指定月份获取YearMonth
        YearMonth ym = year.atMonth(10);
        System.out.println("year年十月：" + ym);    // year年十月：2022-10
        // 当前年月再加5年，减3月
        ym = ym.plusYears(5).minusMonths(3);
        System.out.println("year年再加5年，减3月：" + ym);  // year年再加5年，减3月：2027-07
        MonthDay md = MonthDay.now();
        System.out.println("当前月日：" + md);   // 当前月日：--06-11
        // 设置为5月23日
        MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println("5月23日为：" + md2);    // 5月23日为：--05-23
    }
}
