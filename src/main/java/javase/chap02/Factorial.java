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
		System.out.println("请输入一个整数");
		int n = in.nextInt();
		System.out.println("for循环实现n的阶乘");
		double f =getFactorial(n);
		System.out.printf("%.0f", f);
		System.out.println();
		System.out.println("请输入一个整数");
		n = in.nextInt();
		System.out.println("递归实现n的阶乘");
		f = new Factorial().getFactorial1(n);
		System.out.printf("%.0f", f);

	}

}

