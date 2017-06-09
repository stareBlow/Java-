package Java基础库类;

import java.util.Objects;

/**
 * Created by 孟晨 on 2017/6/8.
 */
public class ObjectsTest {
    // 定义了一个obj变量，它的默认值时null
    static ObjectsTest obj;
    public static void main(String[] args) {
        // 输出一个null对象的hashCode值，输出0
        System.out.println(Objects.hashCode(obj));
        // 输出有一个null对象的toString,输出null
        System.out.println(Objects.toString(obj));
        // 要求obj不能为null，如果obj为null则引发异常
        obj = new ObjectsTest();
        System.out.println(Objects.requireNonNull(obj,
                "Obj的参数不能是null!"));
    }
}
