package javase.chap02;


public class Matrix2D
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int M[][] = new int[5][7];
		int M2[][] = new int[7][5];//M����ת�ú�ľ���
		int a[] = new int[35];//�������ƽ��ֵ������
		int n = 5;
		int m = 7;
		int k = 0;
		int Max = 0;
		int Min = 100;
		int sum = 0;
		double av = 0;
		int index_i1 = 0;
		int index_j1 = 0;
		int index_i2 = 0;
		int index_j2 = 0;
		System.out.println("�������5��7�еĶ�ά����");

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				M[i][j] = (int) (Math.random()*100+1);
				if(Max<M[i][j])
				{
					Max = M[i][j];
					index_i1 = i;
					index_j1 = j;
				}
				if(Min>M[i][j])
				{
					Min = M[i][j];
					index_i2 = i;
					index_j2 = j;
				}
				sum+=M[i][j];//����

			}
		}
		av = sum/35;

		System.out.println("����MΪ��");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(M[i][j]>av)
					a[k++] = M[i][j];
				M2[j][i] = M[i][j];
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("ƽ��ֵ  = "+av+" ���ֵ  = "+Max+" ���ֵ�±�  = " +index_i1+","+index_j1+" ��Сֵ  = "+Min+" ��Сֵ�±�  = " +index_i2+","+index_j2);
		System.out.println("���д���ƽ��ֵ��Ԫ��Ϊ");
		for(int i=0;i<k;i++)
		{
			System.out.print(a[i]+" ");
			if((i+1)%5 == 0)
				System.out.println();
		}

		System.out.println("ת�ú�ľ���M2");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(M2[i][j]+" ");
			}
			System.out.println();
		}




	}

}
