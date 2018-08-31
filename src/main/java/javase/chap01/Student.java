package javase.chap01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String sno;
	private String sname;
	private boolean sex;
	private double hight;
	private double weight;
	private Date brithDate;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sno, String sname, boolean sex, double hight,
			double weight, Date brithDate) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.hight = hight;
		this.weight = weight;
		this.brithDate = brithDate;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getBrithDate() {
		return brithDate;
	}

	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "Student [" + sno + "," + sname + "," + sex
				+ ", " + hight + ", " + weight + ", "
				+ sdf.format(brithDate) + "]";
	}
	public String statusByBMI(Student student)
	{
		double weight = student.getWeight();
		double hight = student.getHight();
		double BMI = weight/(hight*hight);
		System.out.println(BMI);
		String status=null;
		if(BMI < 18.5)
			status = "¹ýÇá";
		return status;
		
	}
	public static void main(String[] args) throws ParseException
	{
		Student student = new Student();
		student.setSno("20151001");
		student.setSname("ÕÅÈý");
		student.setHight(170);
		student.setSex(true);
		student.setWeight(50);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("1980-01-01");
		student.setBrithDate(date);
		System.out.println(student);
	}
}
