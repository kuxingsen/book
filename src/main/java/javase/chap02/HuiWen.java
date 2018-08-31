package javase.chap02;

		import java.util.Scanner;

public class HuiWen
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String string= "";
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数");
		string = in.nextLine();
		StringBuilder stringBuilder = new StringBuilder(string);
		StringBuilder stringBuilder2 = stringBuilder.reverse();
		boolean b = string.contentEquals(stringBuilder2);
		if(b)
			System.out.println("该整数是回文数");
		else
			System.out.println("该整数不是回文数");


	}

}
