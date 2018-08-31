package javase.chap05.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        Integer ia[] = {112,111,23,456,231};
        //将数组转换成List
        List<Integer> list = Arrays.asList(ia);
        Collections.reverse(list);
        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());
        Collections.shuffle(list);
        System.out.println(list.toString());

    }
}
