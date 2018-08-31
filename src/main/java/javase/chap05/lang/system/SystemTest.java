package javase.chap05.lang.system;

import java.util.Map;
import java.util.Properties;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class SystemTest {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.list(System.out);
        Map<String,String> map = System.getenv();
        for(String key:map.keySet())
        {
            System.out.printf("kry = %s,vlaue = %s\n",key,map.get(key));
        }
    }
}
