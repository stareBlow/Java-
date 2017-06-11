package Java基础库类;

import java.math.BigDecimal;

/**
 * Created by 孟晨 on 2017/6/10.
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal("0.05");
        BigDecimal f2 = BigDecimal.valueOf(0.01);
        BigDecimal f3 = new BigDecimal(0.05);
        System.out.println("使用String作为BigDecimal构造器参数：");
        System.out.println("0.05 + 0.01 = " + f1.add(f2));
        System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
        System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
        System.out.println("0.05 / 0.01 = " + f1.divide(f2));
        System.out.println("使用double作为构造器的参数：");
        System.out.println("0.05 + 0.01 = " + f3.add(f2));
        System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
        System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
        System.out.println("0.05 / 0.01 = " + f3.divide(f2));

        /*
        使用String作为BigDecimal构造器参数：
        0.05 + 0.01 = 0.06
        0.05 - 0.01 = 0.04
        0.05 * 0.01 = 0.0005
        0.05 / 0.01 = 5
        使用double作为构造器的参数：
        0.05 + 0.01 = 0.06000000000000000277555756156289135105907917022705078125
        0.05 - 0.01 = 0.04000000000000000277555756156289135105907917022705078125
        0.05 * 0.01 = 0.0005000000000000000277555756156289135105907917022705078125
        0.05 / 0.01 = 5.000000000000000277555756156289135105907917022705078125
        */
        /*
        从上面的结果可以看出一定要使用String作为构造器参数，而不是double
         */
    }
}
