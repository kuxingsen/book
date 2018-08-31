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
		System.out.println("加密后的明文");
		for(int i=0;i<string.length();i++)
		{
			char c = (char) ('a'^string.charAt(i));
			System.out.print(c);
		}
		System.out.println();
		System.out.println("解密后的明文");
		System.out.println(string);


	}

}
