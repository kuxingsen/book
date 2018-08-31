package javase.chap05.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class RegexTest {
    public static void main(String[] args) {
        //1.用pattern类的matches判断指定的字符串是否匹配指定的正则表达式
        //public static boolean matches(String regex,CharSequence input)
        System.out.println(Pattern.matches("a*b","aaaab"));
        //2.用String类中的matches判断当前的字符串是否匹配指定的正则表达式
        //public boolean matches(String regex)
        System.out.println("01234567890123456".matches("\\d{17}"));
        //3.显示一个字符串中所有满足指定正则表达式的子字符串
        Pattern p = Pattern.compile("ab\\.*c");
        Matcher m = p.matcher("ab..cxyzab...cxxx");
        while (m.find())
        {
            System.out.println(m.group()+":"+m.start()+","+m.end());
        }
        //4.用Scanner类指定的分隔符
        Scanner scanner = new Scanner("1 fish 2 fish red fish blue fish");
        scanner.useDelimiter("\\s*fish\\s*");
        while (scanner.hasNext())
        {
            System.out.println(scanner.next()+"\t");
        }
        scanner.close();
        System.out.println();
        //5.用一个正则表达式分割一个字符串
        //java.lang.String.split*java.lang.String)
        String str1 = "123a456b789c";
        String sa1[] = str1.split("[a-zA-Z]");
        System.out.println("共分割成了："+sa1.length);
        for (String s :
                sa1) {
            System.out.println(s+"\t");
        }
        System.out.println();
        //6.用正则表达式分割一个字符串
        //java.util.regex.Pattern.split(java.lang.CharSequence)
        String str = "@answei=2/3,score=5,level=5";
        Pattern pattern = Pattern.compile("[@,][a-z]+=");
        String sa[] = pattern.split(str);
        //String sa[] = str.split("[@,][a-z]+= ");
        System.out.println("共分割成了："+sa.length);
        for (String s :
                sa) {
            System.out.println(s+"\t");
        }
        //输出第一个是空
    }
}
