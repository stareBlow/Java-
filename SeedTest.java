package Java基础库类;

import java.util.Random;

/**
 * Created by 孟晨 on 2017/6/10.
 */
public class SeedTest {
    public static void main(String[] args) {
        Random r1 = new Random(50);
        System.out.println("第一个种子为50的Random对象");
        System.out.println(r1.nextBoolean());
        System.out.println(r1.nextLong());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextDouble());
        System.out.println(r1.nextGaussian());
        Random r2 = new Random(50);
        System.out.println("第二个种子为50的Random对象");
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextLong());
        System.out.println(r2.nextInt());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextGaussian());
        Random r3 = new Random(100);
        System.out.println("第一个种子为50的Random对象");
        System.out.println(r3.nextBoolean());
        System.out.println(r3.nextLong());
        System.out.println(r3.nextInt());
        System.out.println(r3.nextDouble());
        System.out.println(r3.nextGaussian());
    }

}
