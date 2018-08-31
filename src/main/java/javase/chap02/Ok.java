package javase.chap02;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ok
{
	public static double getScore()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("请输入整数n");
		int num = in.nextInt();
		double array[] = new double [num];
		double sum =0;

		for(int i=0;i<num;i++)
		{
			array[i] = in.nextDouble();
			sum+=array[i];



		}
		Arrays.sort(array);
		sum = sum-array[0]-array[num-1];
		double score = sum / (num-2);

		return score;


	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(" 该选手的平均分为："+new Ok().getScore());

	}

}
