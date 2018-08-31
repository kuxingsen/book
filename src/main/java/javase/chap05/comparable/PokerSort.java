package javase.chap05.comparable;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.java2d.pipe.SpanIterator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kuexun on 2018/5/1.
 */
class Card implements Comparable<Card>{

    private char flower;
    private String num;

    public Card() {
    }

    public Card(char flower, String num) {
        this.flower = flower;
        this.num = num;
    }

    @Override
    public String toString() {
        return flower+num;
    }

    @Override
    public int compareTo(Card o) {
        if(this.num == o.num)
        {
            return this.flower-o.flower;
        }else {
            return this.num.compareTo(o.num);
        }
    }

    public char getFlower() {
        return flower;
    }

    public void setFlower(char flower) {
        this.flower = flower;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
public class PokerSort implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getFlower() == o2.getFlower())
        {
            return o1.getNum().compareTo(o2.getNum());
        }
        return o1.getFlower() - o2.getFlower();
    }

    public static void main(String[] args) {
        Card[] pk = new Card[54];
        //
        char[] fa={'\u2660','\u2665','\u2663','\u2666'};
        String[] na = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int k = 0;
        for (int i = 0; i < fa.length; i++) {
            for (int j = 0; j < na.length; j++) {
                pk[k] = new Card(fa[i],na[j]);
                k++;
            }
        }
        pk[52] = new Card(' ',"小王");
        pk[53] = new Card(' ',"大王");
        Arrays.sort(pk);
        System.out.println(Arrays.toString(pk));
        List<Card> list = Arrays.asList(pk);
        Collections.shuffle(list);
        System.out.println(list);
        //按指定排序器对扑克牌进行排序，先按花色后按数字排序
        Collections.sort(list,new PokerSort());
        System.out.println(list);

    }
}
