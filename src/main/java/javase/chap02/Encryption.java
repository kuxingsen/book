package javase.chap02;

import java.util.Scanner;

public class Encryption
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String string  = "";
		Scanner in = new Scanner(System.in);
		string = in.nextLine();
		System.out.println("���ܺ������");
		for(int i=0;i<string.length();i++)
		{
			char c = (char) ('a'^string.charAt(i));
			System.out.print(c);
		}
		System.out.println();
		System.out.println("���ܺ������");
		System.out.println(string);


	}

}
