package Java基础库类;

/**
 * Created by 孟晨 on 2017/6/8.
 */
public class RuntimeTest {
    public static void main(String[] args) {
        // 获取Java程序关联的运行对象
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量："
            + rt.availableProcessors());
        System.out.println("空闲的内存数量："
            + rt.freeMemory());
        System.out.println("总内存数："
            + rt.totalMemory());
        System.out.println("可用的最大内存数："
            + rt.maxMemory());
    }
}
