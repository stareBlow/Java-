package Java基础库类;

/**
 * Created by 孟晨 on 2017/6/8.
 */
public class ExecTest {
    public static void main(String[] args)
        throws Exception
    {
        Runtime rt = Runtime.getRuntime();
        //运行记事本程序
        rt.exec("notepad.exe");
    }

}
