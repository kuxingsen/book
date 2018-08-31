package javase.chap05.Generic;

import java.util.Date;
import java.util.Hashtable;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class GenericTest2<K,V> {
    Hashtable<K,V> ht = new Hashtable<>();
    public void put(K k,V v)
    {
        ht.put(k,v);
    }
    public V get(K k)
    {
        return ht.get(k);
    }

    public static void main(String[] args) {
        GenericTest2<Integer,String> gt = new GenericTest2<>();
        gt.put(9,"天王盖地虎");
        System.out.println(gt.get(9));
        GenericTest2<String,Date> gt1 = new GenericTest2<>();
        gt1.put("好日子",new Date());
        gt1.put("今天",new Date());
        System.out.println(gt1.get("好日子"));
        System.out.println(gt1.get("今天"));
    }
}
