package javase.chap05.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> ca = new ArrayList<>();
        ca.add("����ѧԺ");
        ca.add("�����ѧԺ");
        ca.add("֣ΰ");
        //1.ʹ��Iterator��������
        Iterator<String> it = ca.iterator();
        String s = null;
        while (it.hasNext())
        {
            s = it.next();
            System.out.println(s);
        }
        //2.ʹ��Foreach��������,JDK1.5���ϰ汾
        for (String s1 :
                ca) {
            System.out.println(s1);
        }
        //3.ʹ��toString()������ϵ�����Ԫ��
        System.out.println(ca.toString());
    }
}
