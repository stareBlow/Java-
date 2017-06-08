package Java基础库类;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * Created by 孟晨 on 2017/6/7.
 */
public class SystemTest {
    public static void main(String[] args)
        throws Exception
    {
        // 获取系统所有的环境变量
        Map<String,String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + " ---> " + env.get(name));
        }
        //获取指定环境的变量
        System.out.println(System.getenv("JAVA_HOME"));
        //获取所有系统属性
        Properties props = System.getProperties();
        //将所有系统属性保存在props.txt文件中
        props.store(new FileOutputStream("F:\\Java\\src\\Java基础库类\\props.txt")
                ,"System.Propertise");
        //输出特定的系统文件
        System.out.println(System.getProperty("os.name"));
    }
}
