package javase.chap04.EmployeeSalary;

/**
 * Created by Kuexun on 2018/4/11.
 */
public class BasePlusSalesEmployee extends SalesEmployee {
    private double basicSalary;

    public double getSalary() {
        double salary = super.getSalary();
        salary += basicSalary;
        return salary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "BasePlusSalesEmployee{" +
                "sale=" + sale +
                ", name='" + name + '\'' +
                ", basicSalary=" + basicSalary +
                ", commissionRate=" + commissionRate +
                ", birthDate=" + birthDate +
                '}';
    }
}
