package javase.chap04.static_3;

/**
 * Created by 傻逼 on 2018/4/4.
 */
public class Static {
    public static String myString = "hello";
    public int i = 10;
    public static void staticMethod()
    {
        System.out.println("a static method ....");
    }
    public void nonStaticMethod()
    {
        System.out.println("not a static method...");
    }
}
