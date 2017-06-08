package Java基础库类;

import java.util.Scanner;

/**
 * Created by 孟晨 on 2017/6/7.
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        // System.in 代表标准输入，就是从键盘输入
        Scanner sc = new Scanner(System.in);
        //执行下面一行将只把回车作为分割符
       sc.useDelimiter("1");
        //判断是否还有下一个输入项
        while (sc.hasNext()) {
            // 输出输入项
            System.out.println("键盘的输入内容是："
                + sc.next());
        }
    }
}
