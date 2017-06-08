package Java基础库类;

import java.util.Scanner;

/**
 * Created by 孟晨 on 2017/6/7.
 */
public class ScannerLongTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            System.out.println("键盘输入的内容是：" + sc.nextLong());
        }
    }
}
