package javase.chap05.Generic;

import java.util.ArrayList;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class GenericTest {
    public static void main(String[] args) {
        //数组在定义时指定了元素的类型
        int[] a= new int[10];
        //在编译（Compiler)阶段就可以防止错误的赋值
        //例如"a[1] = 3.14"不能通过编译
        //集合类Collection在构造时无须指定元素类型，默认为Object
        //下面两行ArrayList的定义是等价的
        ArrayList<Object> ala = new ArrayList<>();
        ArrayList hsb = new ArrayList();
        ala.add(100);       //100自动装箱为Integer，再自动上溯造型为Object
        ala.add("String");  //String对象直接上溯造型为Object
        System.out.println(ala.toString());
        //public Object get(int index)
        //从collection取元素时为Object，需要下溯造型为指定的类型，既不方便也不安全
        int n1 = (Integer) ala.get(0);
        System.out.println(n1);
        //下局中错误的下溯造型操作在程序的编译阶段发现不了
//        int n2 = (Integer)ala.get(1);
        //只能在运行时阶段才能被发现，抛出ClasscastException
    }
}
