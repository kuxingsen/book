package javase.chap05.util.dateAndCalenderAndSimpleDateFormat;

import javase.chap04.AutoConStruct_5.D;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class CalenderTest {
    public static void main(String[] args) {
        //1.返回当前系统时间
        Calendar cal1 = Calendar.getInstance();
        Calendar now = new GregorianCalendar();
        //2.calendar 转化为Date
        Date date1 = cal1.getTime();
        //3.Date转化为calendar
        Date date2 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        //4.取给定时间域的最大可能值
        //public int getActualMaximum(Galendar.Day_OF_MONTH)
        cal1.set(Calendar.YEAR,2000);
        //MONTH 的取值：0~11
        cal1.set(Calendar.MONTH,2);
        //DAY_OF_MONTH 的取值：1~31
        cal1.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(cal1.getActualMaximum(Calendar.MONTH));
        //DAY_OF_YEAR 指一年中的第几天
        System.out.println(""+now.get(Calendar.YEAR));
        //DAY_OF_MONTH 指一月中的第几天
        System.out.println(""+now.get(Calendar.DAY_OF_MONTH));
        //DAY_OF_WEEK 指一周中的第几天，即星期几
        //取值：SUNDAY 1、MONDAY 2、。。。
        System.out.println(""+now.get(Calendar.DAY_OF_WEEK));

    }
}
