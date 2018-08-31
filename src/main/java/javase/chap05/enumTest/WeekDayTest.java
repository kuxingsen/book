package javase.chap05.enumTest;

import java.util.EnumSet;

/**
 * Created by Kuexun on 2018/5/1.
 */

enum WeekDay {
    Mon("Monday","����һ"),Tue("Tuesday","���ڶ�"),
    Wed("Wednesday","������"),Rhu("Thursday","������"),
    Fri("Friday","������"),Sat("Saturday","������"),
    Sun("Sunday","������");

    WeekDay(String en, String cn) {
        this.en = en;
        this.cn = cn;
    }
    private final String en;
    private final String cn;

    public String getEn() {
        return en;
    }

    public String getCn() {
        return cn;
    }
}
public class WeekDayTest {
    public static void main(String[] args) {
        //WeekDay �൱�������ռ䣬����������������ͻ
        WeekDay s1 = WeekDay.Fri;
        //ö�ٿ���Я���������Ϣ
        System.out.println(WeekDay.Tue.getCn());
        System.out.println(s1+":"+ s1.getCn());
        //ָ��ö�����͵�ֵ�ı���
        for (WeekDay s :
                WeekDay.values()) {
            System.out.println(s + ":" +s.getCn());
        }
        for (WeekDay s :
                EnumSet.range(WeekDay.Tue, WeekDay.Sat)) {
            System.out.println(s+"-"+s.getEn());
        }
    }
}
