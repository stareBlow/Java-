package Java基础库类;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by 孟晨 on 2017/6/9.
 */



public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("rand.nextBoolean(): " +
            rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        // 生成0.0~1.0之间的伪随机数
        System.out.println("rand.nextDouble(): " + rand.nextDouble());
        // 生成0.0~1.0之间的伪随机数
        System.out.println("rand.nextFloat(): " + rand.nextFloat());
        // 生成一个处于int整数取值范围的伪随机数
        System.out.println("rand.nextInt(): " + rand.nextInt());
        // 生成一个处于long整数取值范围的伪随机数
        System.out.println("rand.nextLong(): " + rand.nextLong());
        // 生成平均值是0.0，标准差是1.0的伪高斯数
        System.out.println("rand.nextGaussian(): " + rand.nextGaussian());
        // 生成0~26的之间的伪随机数
        System.out.println("rand.nextInt(26): " + rand.nextInt(26));
        System.out.println("----------------------------------");
        ThreadLocalRandom rand1 = ThreadLocalRandom.current();
        // 生成一个4~22之间的伪随机数
        System.out.println(rand1.nextInt(4, 22));
        // 生成一个2.0~10.0之间的伪随机数
        System.out.println(rand1.nextDouble(2.0, 10.0));
    }
}
