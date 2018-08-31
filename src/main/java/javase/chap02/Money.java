package javase.chap02;

import java.util.Scanner;

public class Money
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char [] ca = {'Áã','Ò¼','ÙE','Èþ','ËÁ','Îé','Â½','Æâ','°Æ','¾Á'};
		String []ma = {"·Ö","½Ç","Ôª","Ê°","°Û","Çª","Íò","Ê°Íò","°ÙÍò","ÇªÍò","ƒ|"};
		while(in.hasNext())
		{
			double money = in.nextDouble();
			money *= 100;
			long money2 = (long)Math.round(money);
			int []a = new int[20];
			int k=0;
			do
			{
				a[k++] = (int) (money2%10);
				money2/=10;
			} while (money2>=10);
			a[k++] = (int) money2;
			for(int i=k-1;i>=0;i--)
			{
				if(a[i]!=0)
					System.out.print(ca[a[i]]+ma[i]);
			}
			System.out.println();
		}

	}

}
