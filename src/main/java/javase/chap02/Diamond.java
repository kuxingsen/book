package javase.chap02;

public class Diamond
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("循环输出菱形");
		for(int i=-3;i<=3;i++)
		{

			System.out.printf("%36c",' ');
			for(int k=0;k<Math.abs(i);k++)
				System.out.print(' ');
			for(int j=1;j<=7-2*Math.abs(i);j++)
				System.out.print('*');
			System.out.println();
		}
		System.out.println("循环输出反菱形");
		for(int i=-3;i<=3;i++)
		{

			System.out.printf("%36c",' ');
			for(int k=3;k>=Math.abs(i)+1;k--)
				System.out.print(' ');
			for(int j=7-2*Math.abs(i);j<=7;j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
