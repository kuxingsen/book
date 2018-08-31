package javase.chap05.util.dateAndCalenderAndSimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class DateTest {
    public static void main(String[] args) {
        //创建一个Date对象，默认为系统时间
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.toString());
        //一下3行代码分别返回1970年1月1日00：00：00到当前时间的毫秒数
        //可以用于程序运行时间的计算
        long ms1 = new Date().getTime();
        long ms2 = System.currentTimeMillis();
        long ms3 = Calendar.getInstance().getTimeInMillis();
        System.out.println("ms1 = "+ms1+"ms");
        Date date2 = new Date();
        //比较两个日期的先后次序
        //若相等返回0，date1再date2之前返回-1，date1再date2之后返回1
        System.out.println(date2.compareTo(date1));
        System.out.println(date2.equals(date1));
    }
}
