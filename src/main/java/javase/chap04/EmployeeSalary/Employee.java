package javase.chap04.EmployeeSalary;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kuexun on 2018/4/11.
 */
public class Employee {
    protected String name;
    protected Date birthDate;
    public double getSalary(Employee employee)
    {
        return  employee.getSalary();
    }
    public double getSalary()
    {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate){
        Date birth=null;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            birth = dateFormat.parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.birthDate = birth;
    }
}
