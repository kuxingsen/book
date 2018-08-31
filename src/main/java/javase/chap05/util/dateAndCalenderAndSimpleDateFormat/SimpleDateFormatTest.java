package javase.chap05.util.dateAndCalenderAndSimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //1.Date->String ����ʽ���������ʱ��
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy �� MM �� dd �� hh:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);
        //2. String -> Date
        String str = "1972 �� 12 �� 12 �� 00:00:00";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        date1.setTime(5000);
        System.out.println(sdf.format(date1));

    }
}
