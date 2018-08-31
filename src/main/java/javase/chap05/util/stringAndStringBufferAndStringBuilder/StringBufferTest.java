package javase.chap05.util.stringAndStringBufferAndStringBuilder;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer bf1 = new StringBuffer();
        //StringBuffer的实际长度
        System.out.println(bf1.length());
        //StringBuffer 的最大字符容量
        System.out.println(bf1.capacity());
        bf1.append("12345");
        System.out.println(bf1.length());
        System.out.println(bf1.capacity());
        System.out.println(bf1);
        //String ->StringBuffer
        StringBuffer bf2 = new StringBuffer("0123456789");
        System.out.println(bf2.length());
        System.out.println(bf2.capacity());
        //StringBuffer->String
        System.out.println(bf2.toString());
        //翻转字符串
        bf2.reverse();
        System.out.println(bf2.toString());
        bf1.append(bf2);
        System.out.println(bf1);
        bf1.insert(5,"abc");
        System.out.println(bf1);
        bf1.delete(5,8);
        System.out.println(bf1);
        //将【3，7】之间的字符替换为指定字符串
        bf1.replace(3,7,"ZYJ");
        System.out.println(bf1);
        System.out.println();
    }
}
