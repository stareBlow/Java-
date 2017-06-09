package Java基础库类;

/**
 * Created by 孟晨 on 2017/6/8.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = new String("fkit.org");
        System.out.println("s.CharAt(5): " + s.charAt(5));
        System.out.println("-------------------------------");
        String s1 = new String("abcdefghijklmn");
        String s2 = new String("abcdefghij");
        String s3 = new String("abcdefghijalmn");
        System.out.println("s1.compareTo(s2)" + s1.compareTo(s2));  //返回长度差
        System.out.println("s2.compareTo(s3)" + s1.compareTo(s3));  //返回'k'-'a'的差
        System.out.println("-------------------------------");
        char[] ss1 = {'I', ' ', 'l', 'o', 'v', 'e',' ', 'j', 'a', 'v', 'a'};
        String ss2 = new String("ebj");
        ss2.getChars(0, 3, ss1, 7);
        System.out.println(ss1);
        String str1 = "abcdcc";
        String str2 = "  孟晨   ";
        System.out.println(str1.indexOf('c'));
        System.out.println(str1.indexOf('c', 4));
        System.out.println(str2.indexOf("孟晨"));
        System.out.println("-------------------------------");
        String sss1 = "www.baidu.com";
        String sss2 = "baidu";
        System.out.println(sss1.startsWith("www"));
        System.out.println(sss1.startsWith(sss2, 4));
        System.out.println("-------------------------------");
        String st1 = "www.baidu.com";
        char[] st2 = st1.toCharArray();
        System.out.println(st2);
        System.out.println(st1.toUpperCase());
        System.out.println(st1.toLowerCase());
        System.out.println("-------------------------------");
        String stp1 = "java";
        stp1 = stp1 + "struct";
        stp1 = stp1 + "spring";
        System.out.println(stp1);
    }
}
