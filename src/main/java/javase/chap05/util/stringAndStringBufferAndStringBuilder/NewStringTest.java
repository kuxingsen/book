package javase.chap05.util.stringAndStringBufferAndStringBuilder;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class NewStringTest {
    public static void main(String[] args) {
        String s1 = "zyj";
        //String 变量的静态创建方式采用享元模式
        String s2 = "zyj";
        //s1直接指向s2的地址
        //比较两个字符串的地址是否相等
        System.out.println(s1 == s2);
        //采用动态方式创建的字符串不管重复与否都分配新的地址
        String s3 = new String("zyj");
        System.out.println(s1 == s3);
        //比较两个字符串的内容是否相等
        System.out.println(s1.equals(s2));
    }
}
