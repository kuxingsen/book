package javase.chap02;

		import java.util.Scanner;

public class SieveMethod
{
	public static void getPrimes()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("筛选法求整数N以内的素数");
		System.out.println("请输入整数N");
		int N = in.nextInt();
		int i,j;
		int primes[] = new int[N+1];
		for(i=2;i<N;i++)
			if(primes[i]==0)
			{
				for(j=i*i;j<=N;j+=i)
					primes[j] = 1;
			}

		int counter = 0;//计数器
		for(i=2;i<=N;i++)
			if(primes[i]==0) {
				counter++;
				if(counter%10==0)
					System.out.println();
				System.out.print(i+" ");
			}

	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new SieveMethod().getPrimes();
	}

}
