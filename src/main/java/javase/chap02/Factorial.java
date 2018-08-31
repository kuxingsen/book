package javase.chap02;

import java.util.Scanner;

public class Factorial
{

	public static double getFactorial(int n)
	{
		double f = 1.0;
		for (int i = 1; i <= n; i++)
		{
			f *= i;
		}
		return f;
	}

	double getFactorial1(int n)
	{
		double f = 1;
		if (n == 1 || n == 0)
			return 1;
		else
			f = n * getFactorial1(n - 1);
		return f;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������");
		int n = in.nextInt();
		System.out.println("forѭ��ʵ��n�Ľ׳�");
		double f =getFactorial(n);
		System.out.printf("%.0f", f);
		System.out.println();
		System.out.println("������һ������");
		n = in.nextInt();
		System.out.println("�ݹ�ʵ��n�Ľ׳�");
		f = new Factorial().getFactorial1(n);
		System.out.printf("%.0f", f);

	}

}

