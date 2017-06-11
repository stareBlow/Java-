package Java基础库类;
import static java.util.Calendar.*;
import java.util.Calendar;


/**
 * Created by 孟晨 on 2017/6/10.
 */
public class LenientTest {
    public static void main(String[] args) {
        Calendar ca1 = Calendar.getInstance();
        // 结果YEAR字段加1，MONTH字段为1（2）
        ca1.set(MONTH, 13);
        System.out.println(ca1.getTime());
        // 关闭容错性
        ca1.setLenient(false);
        // 运行时是异常
        ca1.set(MONTH, 13);
        System.out.println(ca1.getTime());
    }
}
