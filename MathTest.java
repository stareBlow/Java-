package Java基础库类;

/**
 * Created by 孟晨 on 2017/6/9.
 */
public class MathTest {
    public static void main(String[] args) {
        /*----------------下面是三角运算----------*/
        // 将弧度制转换成角度
        System.out.println("Math.toDegrees(Math.PI / 2):"
            + Math.toDegrees(Math.PI / 2));
        // 将角度装换成弧度
        System.out.println("Math.toRadians(180): " +
            Math.toRadians(180));
        // 计算反余弦，返回角度在0.0 到 pi 之间
        System.out.println("Math.acos(0.5): "
            + Math.acos(0.5));
        // 计算反正弦，返回角度范围在-pi/2到pi/2之间
        System.out.println("Math.asin(0.5): " + Math.asin(0.5));
        // 计算反正切，返回角度范围在 -pi/2 到 pi/2之间
        System.out.println("Math.atan(1): " + Math.atan(1));
        // 计算三角余弦
        System.out.println("Math.cos(Math.PI / 2): " + Math.cos(Math.PI / 2));
        // 计算双曲余弦
        System.out.println("Math.cosh(1.2): " + Math.cosh(1.2));
        // 计算正弦
        System.out.println("Math.sin(Math.PI / 2): " + Math.sin(Math.PI / 2));
        // 计算双曲正弦
        System.out.println("Math.sinh(1.2): " + Math.sinh(1.2));
        // 计算正切
        System.out.println("Math.tan(Math.PI / 4): " + Math.tan(Math.PI / 4));
        // 计算双曲正切
        System.out.println("Math.tanh(2.1): " + Math.tanh(2.1));
        // 将直角坐标（x, y）转化成极坐标（r, thet）
        System.out.println("Math.atan2(0.1, 0.2): "
            + Math.atan2(0.1, 0.2));
        System.out.println("------------------------------");
        /*---------下面是取整运算---------*/
        // 取整，返回小于目标的最大整数
        System.out.println("Math.floor(-1.2): " + Math.floor(-1.2));
        // 取整，返回大于目标的最小整数
        System.out.println("Math.ceil(1.2): " + Math.ceil(1.2));
        // 四舍五入取整
        System.out.println("Math.round(2.6): " + Math.round(2.6));
        System.out.println("------------------------------");
        /*----------下面是乘方、开方、指数运算-------------------*/
        // 计算平方根
        System.out.println("Math.sqrt(4): " + Math.sqrt(4));
        // 计算立方根
        System.out.println("Math.cbrt(8): " + Math.cbrt(8));
        // 返回欧拉数e的n次幂
        System.out.println("Math.exp(2): " + Math.exp(2));
        // 返回sqrt(x2 +y2),没有中间溢出，或下溢
        System.out.println("Math.hypot(4, 4): " + Math.hypot(4, 4));
        // 按照IEEE 754 标准规定，对两个参数进行余数运算
        System.out.println("Math.IEEEremainder(5, 2): "
            + Math.IEEEremainder(5, 2));
        // 计算乘方
        System.out.println("Math.pow(3, 2): " + Math.pow(3, 2));
        // 计算自然数的对数
        System.out.println("Math.log(Math.E): " +
            Math.log(Math.E));
        // 计算底数为10的对数
        System.out.println("Math.log10(10): " + Math.log10(10));
        // 返回参数与1值和的自然数的对数
        System.out.println("Math.log1p(Math.E): " +
            Math.log1p(Math.E - 1));
        System.out.println("------------------------------");
        /*-----------下面是符号相关的运算-------------*/
        // 计算绝对值
        System.out.println("Math.abs(-4.5): " + Math.abs(-4.5));
        // 返回带有第二个浮点数符号的第一个浮点数
        System.out.println("Math.copySign(1.2, -1.0): " + Math.copySign(1.2, -1.0));
        // 符号函数，如果参数为0，则返回0；如果参数大于0，返回1.0
        // 如果参数小于0，返回-1.0
        System.out.println("Math.signum(2.3): " + Math.signum(2.3));
        System.out.println("------------------------------");
        /*----------下面是大小相关的运算-------*/
        System.out.println("Math.max(2.3, 4.5): " + Math.max(2.3, 4.5));
        System.out.println("Math.min(2.3, 4.5): " + Math.min(2.3, 4.5));
        // 返回第一个参数与第二个参数之间与第一个参数相邻的浮点数
        System.out.println("Math.nextAfter(1.2, 1.3): " + Math.nextAfter(1.2, 1.3));
        // 返回比目标略大的浮点数
        System.out.println("Math.nextUp(1.2): " + Math.nextUp(1.2));
        // 返回一个随机数
        System.out.println("Math.random(): " + Math.random());
    }
}
