package javase.chap04.AutoConStruct_5;

/**
 *
 * Created by Kuexun on 2018/4/29.
 */
public class A {
    {
        System.out.println("-----A�ķǾ�̬����-------");
    }
    static {
        System.out.println("--------A�ľ�̬����---------");
    }

    public A() {
        System.out.println("-----����A()-----");
    }
}
