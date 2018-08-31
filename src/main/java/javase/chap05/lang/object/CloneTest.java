package javase.chap05.lang.object;

import java.util.HashSet;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class CloneTest {
    public static void main(String[] args) {
        //基本数据类型的备份
        int i = 100;
        int j = i;
        HashSet<Character> hs1 = new HashSet<Character>();
        hs1.add('a');
        hs1.add('b');
        hs1.add('c');
        //引用类型变量地址的备份
        HashSet<Character> hs2 = hs1;
        System.out.println(hs1 == hs2);
        //引用类型变量内容的备份
        HashSet<Character> hs3 = (HashSet)hs1.clone();
        System.out.println(hs3);
        System.out.println("Address:hs1=hs3?"+(hs1==hs3));
        System.out.println(hs1.equals(hs3));

        System.out.println(hs1.toString()+hs2+hs3);

    }
}
