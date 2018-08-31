package javase.chap02;

import java.util.Scanner;

public class Factor
{

	/*
	 #include<stdio.h>
#define N 70000
int prime[N],isprime[60];
int main()
{
    int i,k,j=1;
    for(i=2;i*i<=N;i++)
    {
        if(!prime[i])
        {
            isprime[j++]=i;
            for(k=i*i;k<=N;k+=i)
                prime[k]=1;
        }
    }
    int x,q,p;

    while(scanf("%d",&x)!=EOF)
    {
        p=x;
        for(q=1;isprime[q]<=x&&q<=55;q++)
        {
           while(x!=isprime[q])
            {
                if(x%isprime[q]==0)
                {
                    printf("%d ",isprime[q]);
                    x/=isprime[q];
                }
                else
                    break;
            }
        }
        if(p==x)
            printf("%d %d\n",1,x);
        else
            printf("%d\n",x);
    }

}

 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int prime[] = new int [70000];//筛选70000以内的素数
		int isprime[] = new int [60];//保存素数
		int x = 0;
		int p = 0;
		int q = 0;
		int i = 0;
		int k = 0;
		int j = 1;
		int N = 70000;
		//筛选素数
		for(i=2;i*i<=N;i++)
		{
			if(prime[i]==0)
			{
				isprime[j++]=i;
				for(k=i*i;k<N;k+=i)
					prime[k]=1;
			}
		}
		System.out.println("请输入一个小于2的16次方的整数");
		while(in.hasNext())
		{

			x = in.nextInt();

			System.out.print("1x");
			p=x;
			for(q=1;isprime[q]<=x&&q<=55;q++)//55个素数内
			{
				while(x!=isprime[q])
				{
					if(x%isprime[q]==0)
					{
						System.out.print(isprime[q]+"x");
						x/=isprime[q];
					}
					else
						break;
				}
			}
			if(p==x)
				System.out.println(x);
			else
				System.out.println(x);
		}
	}

}
