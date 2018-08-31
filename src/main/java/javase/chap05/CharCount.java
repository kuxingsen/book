package javase.chap05;


import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class CharCount {
    public static void charCount(TreeMap<Character,Integer> treeMap,String str)
    {
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            int count=1;
            if(treeMap.containsKey(c))
            {
                count = treeMap.get(c)+1;
            }
            treeMap.put(c,count);
        }
       // System.out.println(treeMap);
    }
    public static void main(String[] args) {
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        CharCount.charCount(treeMap,str);
        System.out.println(treeMap);
    }
}
