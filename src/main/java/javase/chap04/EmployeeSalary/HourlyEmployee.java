package javase.chap04.EmployeeSalary;

/**
 * Created by Kuexun on 2018/4/11.
 */
public class HourlyEmployee extends Employee {
    private double hourSalary;
    private int hours;

    public double getSalary() {
        double salary = 0f;
        if(hours <= 160)
        {
            salary = hourSalary*hours;
        }else {
            salary = hourSalary*160;
            salary += hourSalary*1.5*(hours-160);
        }
        return salary;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourSalary=" + hourSalary +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", birthDate=" + birthDate +
                '}';
    }
}
