package javase.chap05.util.stringAndStringBufferAndStringBuilder;

import java.util.Arrays;

/**
 * Created by Kuexun on 2018/4/30.
 */
public class StringTest {
    public static void main(String[] args) {
        //构造方法
        String s1 = "abc";
        //public String(String original)
        String s2 = new String("abc");
        //public String(char[] value)char[]->String
        char[] ca = {'a','b','c'};
        String s3 = new String(ca);
        //常用方法
        //Public char charAt(int index),String 的下边和数组的下标从0开始
        String s = "0123456789";
        System.out.println("s.charAt(5) = "+s.charAt(5));
        //public int indexOf(int ch)返回指定字符再String中第一次出现的下标
        System.out.println("abcdefabcdaaa".indexOf('c'));
        //public String replace(char oldChar,char newChar)
        System.out.println("Let's make things better".replace('e','o'));
        //public boolean matches(String regex)正则表达式
        //17位数字String匹配
        System.out.println("01234567890123456".matches("\\d{17}"));
        System.out.println("012345ab123453".matches("\\d{17}"));
        System.out.println("012345".matches("\\d{17}"));
        //public String[] split(String regex)
        String s7 = "美国、中国，加拿大、英国，德国";
        //Stringp[ sa = s7.split("[，、。]");//[]中代表字符中的任意一个
        String[] sa = s7.split("，|、|。");//|在正则表达式中时“或”的意思
        System.out.println(Arrays.toString(sa));
        for(int i = 0 ; i < sa.length; i++)
        {
            System.out.println(sa[i]);
        }
        //public String subString(int begin,int end)取子字符串
        System.out.println("smiles".substring(1,5));
        //public char[] toCharArray() String -> char[]
        char[] ca1 = s7.toCharArray();
        //public static String calueOf(char[] data) char[]->String
        s1 = new String(ca1);
        System.out.println(s1);
        s1 = String.valueOf(ca1);
        System.out.println(s1);
    }
}
