package javase.chap02;

		import java.util.Scanner;

public class HuiWen
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String string= "";
		Scanner in = new Scanner(System.in);
		System.out.println("������һ������");
		string = in.nextLine();
		StringBuilder stringBuilder = new StringBuilder(string);
		StringBuilder stringBuilder2 = stringBuilder.reverse();
		boolean b = string.contentEquals(stringBuilder2);
		if(b)
			System.out.println("�������ǻ�����");
		else
			System.out.println("���������ǻ�����");


	}

}
