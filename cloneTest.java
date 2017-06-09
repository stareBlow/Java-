package Java基础库类;

import java.util.Scanner;

/**
 * Created by 孟晨 on 2017/6/8.
 */
class Address {
    String detail;
    public Address(String detial) {
        this.detail = detail;
    }
}

// 实现Cloneable 接口
class User implements Cloneable {
    int age;
    Address address;
    public User(int age) {
        this.age = age;
        address = new Address("孟晨");
    }
    // 通过调用supe.clone来实现clone()方法
    public User clone()
        throws CloneNotSupportedException
    {
        return (User)super.clone();     // 调用的时父类的构造器
    }
}
public class cloneTest {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        User u1 = new User(29);
        // clone得到u1对象的副本
        User u2 = u1.clone();
        // 判断u1、u2是否相同
        System.out.println(u1 == u2);
        // 判断u1、u2的address是否相同
        System.out.println(u1.address == u2.address);
    }
}

/*
public class cloneTest {
    public static void main(String[] args) {
        int count = 0;
        String[] str = new String[3];
        Scanner sc = new Scanner(System.in);       // 输入
        for(int i = 0; i < 3; i++)  // 输入循环
            str[i] = sc.nextLine();
        String p = sc.nextLine();
        for(int i = 0; i < 3; i++) {    //检查的循环
            if(p.equals(str[i]))
                count++;
        }
        if(count == 0)
            count = -1;
        System.out.println(count);  // 输出
    }
}
*/