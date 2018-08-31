package javase.chap02;

public class PrimeNumber
{
	public static int counter;
	public static void isPrime(int n)
	{
		int flag = 0;
		for(int j=2;j<=Math.sqrt(n);j++)
			if(n%j==0) {
				flag = 1;
				break;
			}
		if(flag==0) {
			counter++;
			if(counter%10==0)
				System.out.println();
			System.out.print(n+" ");
		}

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("1000以内的素数");
		for(int i=2;i<1000;i++)
		{
			new PrimeNumber().isPrime(i);
		}
	}

}
