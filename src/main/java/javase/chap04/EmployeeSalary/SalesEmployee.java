package javase.chap04.EmployeeSalary;

/**
 * Created by Kuexun on 2018/4/11.
 */
public class SalesEmployee extends Employee {
    protected double sale;
    protected double commissionRate;

    public double getSalary() {
        double salary=0f;
        salary = sale*commissionRate;
        return salary;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "sale=" + sale +
                ", name='" + name + '\'' +
                ", commissionRate=" + commissionRate +
                ", birthDate=" + birthDate +
                '}';
    }
}
