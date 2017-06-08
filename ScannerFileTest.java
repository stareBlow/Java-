package Java基础库类;

import java.io.File;
import java.util.Scanner;

/**
 * Created by 孟晨 on 2017/6/7.
 */
public class ScannerFileTest {
    public static void main(String[] args)
        throws Exception    // 表明main方法不处理任何异常

    {
        // 将一个File对象作为Scanner的构造器参数，Scanner读取文件内容
        Scanner sc = new Scanner(new File("F:\\Java\\src\\Java基础库类\\ScannerFileTest.java"));
        System.out.println("ScannerFileTest.java的文件内容如下：");
        //判断是否还有下一行
        while(sc.hasNextLine()) {
            // 输出文件中的下一行
            System.out.println(sc.nextLine());
        }
    }
}
