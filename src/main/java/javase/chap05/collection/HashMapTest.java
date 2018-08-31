package javase.chap05.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kuexun on 2018/4/30.
 */
class Student{
    private int sno = 0;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int sno, String name, double score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,Student> hh = new HashMap<>();
        hh.put(199901,new Student(199901,"JAVA",98));
        hh.put(199902,new Student(199902,"zhangsan",98));
        hh.put(199903,new Student(199903,"Lisi",98));
        hh.put(199904,new Student(199904,"wangwu",98));
        hh.put(199905,new Student(199905,"zhengliu",98));
        hh.put(199906,new Student(199906,"xiaoming",98));
        System.out.println(hh.size());
        System.out.println(hh.get(199906));
        //1.通过遍历keySet来访问Value
        System.out.println("通过遍历keySet来访问Value");
        Set<Integer> hSet = hh.keySet();
        Iterator<Integer> it = hSet.iterator();
        Integer key;
        while (it.hasNext())
        {
            key = it.next();
            System.out.println("Key:"+key+",Value:"+hh.get(key));
        }
        //2.用Map.Entry遍历Map
        System.out.println("用Map.Entry遍历Map");
        Set<Map.Entry<Integer,Student>> es = hh.entrySet();
        for (Map.Entry<Integer,Student > me :es
             ) {
            System.out.println("Key:"+me.getKey()+",Value:"+me.getValue());
        }
        //3.For语句增强
        System.out.println("For语句增强");
        for (Integer key1 :
                hh.keySet()) {
            System.out.println(key1+":"+hh.get(key1));
        }

    }
}
