package javase.chap02;

import java.util.LinkedList;
import java.util.Scanner;


public class Joseph
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("������N,M,K,NΪN����,MΪ��M����,K����Ϊ����");
		int N = in.nextInt();
		int M = in.nextInt();
		int K = in.nextInt();
		int a[] = new int[20];
		int counter = 1;
		int index = 2;
		System.out.println("����˳��Ϊ��");
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
				System.out.printf("ֻʣ��%d",i);
	}

}
