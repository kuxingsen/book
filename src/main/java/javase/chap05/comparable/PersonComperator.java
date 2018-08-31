package javase.chap05.comparable;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.Collator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.TreeSet;

/**
 * Created by Kuexun on 2018/5/1.
 */
class Person{
    private String name;
    private Date birthDate;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Person() {
    }

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
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

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
public class PersonComperator implements Comparator<Person> {
    Collator cmp = Collator.getInstance(Locale.CHINA);
    @Override
    public int compare(Person o1,Person o2) {
        if(cmp.compare(o1.getName(),o2.getName())==0)
        {
            return o1.getBirthDate().compareTo(o2.getBirthDate());
        }else {
            return cmp.compare(o1.getName(),o2.getName());
        }
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd");
        Person p1 = new Person("章三",sdf.parse("1984 - 3 - 1"));
        Person p2 = new Person("里斯",sdf.parse("1985 - 6 - 1"));
        Person p3 = new Person("王五",sdf.parse("1983 - 4 - 1"));
        Person p4 = new Person("赵流",sdf.parse("1981 - 5 - 1"));
        Person p5 = new Person("章三",sdf.parse("1982 - 1 - 1"));
        TreeSet<Person> ts = new TreeSet<>(new PersonComperator());
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        System.out.println(ts);
    }
}
