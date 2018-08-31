package javase.chap05;

/**
 * Created by Kuexun on 2018/5/1.
 */
class  StringFind{
    public static void findIndex(String ss,String s)
    {
        System.out.println(ss);
        int index;
        int indexReal = 0;//真实下标
      //  System.out.println(ss.indexOf(s));
        while ((index = ss.indexOf(s)) >= 0)
        {
            indexReal+=index;
            System.out.print(indexReal+",");
            ss = ss.substring(index+s.length(),ss.length());//每次需跳过被匹配子串的长度
            indexReal+=s.length();
           // System.out.println(ss);
        }
        System.out.println();
    }
    public static void findIndexAvoidRule(String ss,String s)
    {
        ss = ss.toUpperCase();
        s = s.toUpperCase();
        findIndex(ss,s);
    }
}
public class StringFindTest {
    public static void main(String[] args) {
        String str = "AA012345A12345aa23443aA324243Aa324234aa";
        StringFind.findIndex(str,"AA");
        StringFind.findIndexAvoidRule(str,"AA");
    }
}
