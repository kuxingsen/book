package javase.chap05.enumTest;

import java.util.EnumSet;

/**
 * Created by Kuexun on 2018/5/1.
 */

enum WeekDay {
    Mon("Monday","星期一"),Tue("Tuesday","星期二"),
    Wed("Wednesday","星期三"),Rhu("Thursday","星期四"),
    Fri("Friday","星期五"),Sat("Saturday","星期六"),
    Sun("Sunday","星期日");

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
        //WeekDay 相当于命名空间，避免与其他常量冲突
        WeekDay s1 = WeekDay.Fri;
        //枚举可以携带更多的信息
        System.out.println(WeekDay.Tue.getCn());
        System.out.println(s1+":"+ s1.getCn());
        //指定枚举类型的值的遍历
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
