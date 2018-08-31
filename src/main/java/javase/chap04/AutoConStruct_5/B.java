package javase.chap04.AutoConStruct_5;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class B extends A{

    {
        System.out.println("-----BµÄ·Ç¾²Ì¬Óï¾ä¿é-------");
    }
    static {
        System.out.println("--------BµÄ¾²Ì¬Óï¾ä¿é---------");
    }

    public B() {
        System.out.println("-----µ÷ÓÃB()-----");
    }
}
