package javase.chap02;

import java.util.LinkedList;
import java.util.Scanner;


public class Joseph
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("请输入N,M,K,N为N个人,M为第M个人,K出列为步数");
		int N = in.nextInt();
		int M = in.nextInt();
		int K = in.nextInt();
		int a[] = new int[20];
		int counter = 1;
		int index = 2;
		System.out.println("出队顺序为：");
		while(counter<N)
		{
			int step = 0;
			while(true)
			{

				if (a[index]==0)
				{
					index++;
					step++;
					if(step==K)
					{
						a[index-1] = 1;System.out.print((index-1)+" ");
						counter++;
						break;

					}
				}
				else
					index++;
				index = index%N;
			}
		}
		System.out.println();
		for(int i=0;i<N;i++)
			if(a[i]==0)
				System.out.printf("只剩下%d",i);
	}

}
