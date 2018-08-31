package javase.chap05.util.stringAndStringBufferAndStringBuilder;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class SplitTest {
    public static void main(String[] args) {
        String ip = "192.168.128.33";
        //.在正则表达式中代表任何字符
        //要表示.必须中转义字符\\
        String[] sa = ip.split("\\.");
        System.out.println(sa.length);
        for (int i = 0; i < sa.length; i++) {
            System.out.println(sa[i]);
        }
        String s= "The title of the band's first name,Hybrid Theory,describes both their artistic goals and their methods for making music.";
        //s代表空格类字符\t、\n、\x0B、\f、\r等、|代表或
        String[] sa1 = s.split("\\s|'|,|\\.| ");
        System.out.println(sa1.length);
        for (int i = 0; i < sa1.length; i++) {
            System.out.println(sa1[i]);
        }
    }
}
