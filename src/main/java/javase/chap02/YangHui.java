package javase.chap02;



public class YangHui
{
	public static int Factorial(int n)
	{
		int f = 1;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int array[][] = new int [6][6];
		int array2[][] = new int [6][6];
		for(int i=0;i<6;i++)
		{
			array[i][i] = array[i][0] = 1;
			array2[i][i] = array2[i][0] = 1;

		}
		//二位数组实现杨辉三角
		for(int i=1;i<6;i++)
			for(int j=1;j<i;j++)
			{
				array[i][j] = array[i-1][j-1]+array[i-1][j];
			}
		//用组合实现杨辉三角
		for(int i=0;i<6;i++)
			for(int j=0;j<=i;j++)
			{
				array2[i][j] = Factorial(i)/(Factorial(j)*Factorial(i-j));
			}

		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}


	}

}
