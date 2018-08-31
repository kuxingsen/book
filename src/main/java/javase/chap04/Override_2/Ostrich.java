package javase.chap04.Override_2;

/**
 * Created by 傻逼 on 2018/4/4.
 */
public class Ostrich extends Bird{
    public void fly()
    {
        super.fly();
        System.out.println("Ostrich()...");
    }
}
