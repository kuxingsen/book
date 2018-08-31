package javase.chap01;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.Calendar;

public class HelloWorld {
	public static String getDate(int year, int month)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, year);
		int day=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		String date = year+"年"+month+"月有"+day;
		return date;
		
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年月：");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		String date = getDate(year,month);
		System.out.println(date);
	}
}
