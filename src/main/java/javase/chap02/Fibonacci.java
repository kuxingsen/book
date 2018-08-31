package javase.chap02;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BigInteger b[] = new BigInteger[1000];
		b[0] = BigInteger.valueOf(1);
		b[1] = BigInteger.valueOf(1);
		int counter = 2;
		System.out.print(b[0]+" "+b[1]+" ");
		for (int i = 2; i < 100; i++)
		{
			b[i] = b[i-1].add(b[i-2]);
			System.out.print(b[i]+" ");
			counter++;
			if(counter%10==0)
				System.out.println();
		}

	}

}
