package javase.chap05.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class RegexTest {
    public static void main(String[] args) {
        //1.��pattern���matches�ж�ָ�����ַ����Ƿ�ƥ��ָ����������ʽ
        //public static boolean matches(String regex,CharSequence input)
        System.out.println(Pattern.matches("a*b","aaaab"));
        //2.��String���е�matches�жϵ�ǰ���ַ����Ƿ�ƥ��ָ����������ʽ
        //public boolean matches(String regex)
        System.out.println("01234567890123456".matches("\\d{17}"));
        //3.��ʾһ���ַ�������������ָ��������ʽ�����ַ���
        Pattern p = Pattern.compile("ab\\.*c");
        Matcher m = p.matcher("ab..cxyzab...cxxx");
        while (m.find())
        {
            System.out.println(m.group()+":"+m.start()+","+m.end());
        }
        //4.��Scanner��ָ���ķָ���
        Scanner scanner = new Scanner("1 fish 2 fish red fish blue fish");
        scanner.useDelimiter("\\s*fish\\s*");
        while (scanner.hasNext())
        {
            System.out.println(scanner.next()+"\t");
        }
        scanner.close();
        System.out.println();
        //5.��һ��������ʽ�ָ�һ���ַ���
        //java.lang.String.split*java.lang.String)
        String str1 = "123a456b789c";
        String sa1[] = str1.split("[a-zA-Z]");
        System.out.println("���ָ���ˣ�"+sa1.length);
        for (String s :
                sa1) {
            System.out.println(s+"\t");
        }
        System.out.println();
        //6.��������ʽ�ָ�һ���ַ���
        //java.util.regex.Pattern.split(java.lang.CharSequence)
        String str = "@answei=2/3,score=5,level=5";
        Pattern pattern = Pattern.compile("[@,][a-z]+=");
        String sa[] = pattern.split(str);
        //String sa[] = str.split("[@,][a-z]+= ");
        System.out.println("���ָ���ˣ�"+sa.length);
        for (String s :
                sa) {
            System.out.println(s+"\t");
        }
        //�����һ���ǿ�
    }
}
