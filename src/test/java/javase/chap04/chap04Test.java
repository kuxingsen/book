package javase.chap04;

import javase.chap04.AutoConStruct_5.B;
import javase.chap04.AutoConStruct_5.D;
import javase.chap04.CastUpDown_10.Animals;
import javase.chap04.CastUpDown_10.Fish;
import javase.chap04.ConStructor_4.Animal;
import javase.chap04.ConStructor_4.Wolf;
import javase.chap04.EmployeeSalary.*;
import javase.chap04.ExtendsTest.Car;
import javase.chap04.ExtendsTest.Truck;
import javase.chap04.ExtendsTest.Vehicle;
import javase.chap04.GameRoleTest.Magicer;
import javase.chap04.GameRoleTest.Soldier;
import javase.chap04.GameRoleTest.Team;
import javase.chap04.ImplementsTest.Person;
import javase.chap04.Override_2.Bird;
import javase.chap04.Override_2.Ostrich;
import javase.chap04.Throw_16.Throw;
import javase.chap04.static_3.Static;
import org.junit.Test;

public class chap04Test {
    @Test
    public void testExtends()
    {
        Vehicle vehicle = new Vehicle(4,120f);
        System.out.println(vehicle);
        Car car = new Car(3,50f,5);
        System.out.println(car);
        Truck truck = new Truck(4,150f,3,500f);
        System.out.println(truck);
    }
    @Test
    public void testImplements()
    {
        Person person = new Person();
        person.breathe();
        person.eat();
        person.learn();
        person.sleep();
        person.think();
    }

    @Test
    public void testGameRole()
    {
        Magicer magicer = new Magicer("老大",5);
        Team team = new Team(magicer);
        Soldier soldier1 = new Soldier("黑尔",11);
        Soldier soldier2 = new Soldier("章三",15);
        Soldier soldier3 = new Soldier("李斯",13);
        Soldier soldier4 = new Soldier("王武",17);
        Soldier soldier5 = new Soldier("赵流",10);
        Soldier soldier6 = new Soldier("天启",20);
        team.addMember(soldier1);
        team.addMember(soldier2);
        team.addMember(soldier3);
        team.addMember(soldier4);
        team.addMember(soldier5);
        team.addMember(soldier6);
        System.out.println(team.attackSum());
    }

    @Test
    public void testEmployeeSalary()
    {
        Employee employee = new Employee();

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.setName("公务员");
        salariedEmployee.setBirthDate("1997-01-01");
        salariedEmployee.setSalary(3333);
        System.out.println(salariedEmployee.toString()+employee.getSalary(salariedEmployee));

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setName("计时工");
        hourlyEmployee.setBirthDate("2000-03-03");
        hourlyEmployee.setHours(100);
        hourlyEmployee.setHourSalary(12.5f);
        System.out.println(hourlyEmployee.toString()+employee.getSalary(hourlyEmployee));

        SalesEmployee salesEmployee = new SalesEmployee();
        salesEmployee.setName("销售");
        salesEmployee.setBirthDate("2011-03-05");
        salesEmployee.setSale(33333);
        salesEmployee.setCommissionRate(0.12);
        System.out.println(salesEmployee.toString()+employee.getSalary(salesEmployee));

        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee();
        basePlusSalesEmployee.setName("有底薪");
        basePlusSalesEmployee.setBasicSalary(1500);
        basePlusSalesEmployee.setBirthDate("1999-09-09");
        basePlusSalesEmployee.setSale(33333);
        basePlusSalesEmployee.setCommissionRate(0.12);
        System.out.println(basePlusSalesEmployee.toString()+employee.getSalary(basePlusSalesEmployee));
    }

    @Test
    public void testCombination_1()
    {
        javase.chap04.Combination_1.Car car = new javase.chap04.Combination_1.Car();
        car.engine.start();
        car.doors[0].close();
        car.windows[0].rolldown();
    }
    @Test
    public void testOverride_2()
    {
        Ostrich o = new Ostrich();
        o.fly();
        Bird b = new Ostrich();
        b.fly();
    }
    @Test
    public void testStatic_3()
    {
        Static.staticMethod();
        Static st = new Static();
        st.staticMethod();
        System.out.println(Static.myString);
        System.out.println(st.myString);
        st.nonStaticMethod();
        Static se = new Static();
        System.out.println(se.i);
    }
    @Test
    public void testConStruct_4()
    {
        new Wolf();
    }

    @Test
    public void testAutoConStruct_5()
    {
        D d = new D();
    }
    @Test
    public void testCastUpDown_10()
    {
        //Fish上溯为Animal，将丢失再父类Animal上增加的新方法
        Animals an = new Fish();
        //an.suim();
        an.breathe();
        //覆盖父类的方法不会损失掉
        Fish f = (Fish) an;
        f.swim();
    }
    @Test
    public void testThrow()
    {
        Throw t = new Throw();
        t.manager();
    }
}
