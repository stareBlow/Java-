package Java基础库类;

import java.math.BigDecimal;

/**
 * Created by 孟晨 on 2017/6/10.
 */
public class Airth {
    // 默认除法精度的计算
    private static final int DEF_DIV_SCALE = 10;
    private Airth(){}
    // 提供加法精确计算
    public static double add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }
    // 提供精确的减法运算
    public static double sub(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.subtract(b2).doubleValue();
    }
    // 提供精确的乘法运算
    public static double mul(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }
    // 提供相对精确的除法计算，当发生除不尽的情况时
    // 请确到小数点以后10位数字进行四舍五入
    public static double div(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.divide(b2,DEF_DIV_SCALE,
                BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static void main(String[] args) {
        System.out.println("0.05 + 0.1 = "
             + Airth.add(0.05, 0.1));
        System.out.println("1.0 - 0.42 = "
             + Airth.sub(1.0, 0.42));
        System.out.println("4.015 * 100 = "
             + Airth.mul(1.0, 100));
        System.out.println("123.3 / 100 = "
             + Airth.div(123.3, 100));
    }

}
