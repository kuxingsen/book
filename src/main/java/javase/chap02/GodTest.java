package javase.chap02;

		import java.util.Scanner;

public class GodTest
{

	public static int god(int n,int m)
	{
		if(m%n==0)
			return n;
		return  god(m%n, n);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入两个自然数n和m,n<m");
		int n = in.nextInt();
		int m = in.nextInt();
		int g = 0;//最大公因数
		int p = 0;//最小公倍数
		if(n>m)
		{
			int tmp = n;
			n = m;
			m = tmp;
		}

		if(n==0)
		{
			System.out.println("最大公约数   = "+m+" 最小公倍数  = "+n);
		}
		else
		{
			g = god(n, m);
			p = n*m/g;
			System.out.println("最大公约数   = "+g+" 最小公倍数  = "+p);
		}

	}

}
