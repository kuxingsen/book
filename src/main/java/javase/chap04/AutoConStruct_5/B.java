package javase.chap04.AutoConStruct_5;

/**
 * Created by Kuexun on 2018/4/29.
 */
public class B extends A{

    {
        System.out.println("-----B�ķǾ�̬����-------");
    }
    static {
        System.out.println("--------B�ľ�̬����---------");
    }

    public B() {
        System.out.println("-----����B()-----");
    }
}
