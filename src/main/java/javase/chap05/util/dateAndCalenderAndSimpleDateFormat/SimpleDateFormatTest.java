package javase.chap05.util.dateAndCalenderAndSimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //1.Date->String ：格式化输出日期时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 hh:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);
        //2. String -> Date
        String str = "1972 年 12 月 12 日 00:00:00";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        date1.setTime(5000);
        System.out.println(sdf.format(date1));

    }
}
