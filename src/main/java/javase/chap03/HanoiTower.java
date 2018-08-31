package javase.chap03;

/**
 * Created by 傻逼 on 2018/3/27.
 */
public class HanoiTower {
    static void Move(int n,char x,char y)
    {
        System.out.println("把"+n+"号从"+x+"挪动到"+y);
    }
    static void Hannoi( int n, char a, char b, char c )
    {
        if( n == 1 )
            Move(1,a,c);
        else
        {
            Hannoi(n-1,a,c,b);
            Move(n,a,c);
            Hannoi(n-1,b,a,c);
        }
    }
}
