package Java基础库类;

/**
 * Created by 孟晨 on 2017/6/9.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();
        // 追加字符
        sc.append("java");  //sc = "java"
        sc.insert(0, "hello "); //sc = "helllo java"
        sc.replace(5, 6, ",");  //sc = "hello,java"
        sc.delete(5, 6);    //sc = "hellojava"
        System.out.println(sc);
        //反转
        sc.reverse();
        System.out.println("反转：" + sc);
        System.out.println(sc.length());
        System.out.println(sc.capacity());
    }
}
