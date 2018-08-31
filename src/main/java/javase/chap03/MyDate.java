package javase.chap03;

public class MyDate {
	private int year;
	private int month;
	private int day;
	public MyDate()
	{
		super();
	}
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 1 && year < 9999)
			this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if( month >= 1 && month <=12)
			this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 1 && day <= 31)
			this.day = day;
	}
}
