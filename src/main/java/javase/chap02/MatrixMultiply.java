package javase.chap02;

import java.util.Scanner;

public class MatrixMultiply
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A[][] = new int[10][10];
		int B[][] = new int [10][10];
		int C[][] = new int [10][10];
		int n = 0;
		int m = 0;
		int n2 = 0;
		int m2 = 0;
		System.out.println("���������A������������");
		n = in.nextInt();
		m = in.nextInt();
		System.out.println("��Ϊ����A��ֵ");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				A[i][j] = in.nextInt();
			}

		System.out.println("���������B������������");
		n2 = in.nextInt();
		m2 = in.nextInt();
		System.out.println("��Ϊ����B��ֵ");
		for(int i=0;i<n2;i++)
			for(int j=0;j<m2;j++)
			{
				B[i][j] = in.nextInt();
			}

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m2;j++)
			{
				for(int k=0;k<m;k++)
				{
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("A������B������˵Ľ������CΪ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m2;j++)
				System.out.print(C[i][j]+" ");
			System.out.println();
		}

	}

}
/*
 �����
  ���������A������������
3 4
��Ϊ����A��ֵ
3 0 0 7
0 0 0 -1
0 2 0 0
���������B������������
4 2
��Ϊ����B��ֵ
4 1
0 0
1 -1
0 2
A������B������˵Ľ������CΪ
12 17 
0 -2 
0 0 

 */
