package javase.chap04.EmployeeSalary;

/**
 * Created by Kuexun on 2018/4/11.
 */
public class SalariedEmployee extends Employee{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
