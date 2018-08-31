package javase.chap02;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Scanner r = new Scanner(System.in);
		int y = r.nextInt();
		int m = r.nextInt();
		//int d = r.nextInt();
		calendar.set(calendar.YEAR, y);
		calendar.set(calendar.MONTH, m-1);
		//calendar.set(calendar.DAY_OF_MONTH, d);
		int num = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println(num);

	}

}
