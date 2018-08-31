package javase.chap04.AutoConStruct_5;

/**
 *
 * Created by Kuexun on 2018/4/29.
 */
public class A {
    {
        System.out.println("-----AµÄ·Ç¾²Ì¬Óï¾ä¿é-------");
    }
    static {
        System.out.println("--------AµÄ¾²Ì¬Óï¾ä¿é---------");
    }

    public A() {
        System.out.println("-----µ÷ÓÃA()-----");
    }
}
