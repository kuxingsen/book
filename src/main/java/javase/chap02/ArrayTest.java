package javase.chap02;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest
{
	public static void ArraySort(int []array)//Arrays.sort();
	{
		Arrays.sort(array);
	}
	public static void BubbleSort(int []array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int array[] = new int[1000];
		int array2[] = new int[1000];
		//ArrayList<Integer> list = new ArrayList();
		for(int i=0;i<100;i++)
		{
			array[i] = (int) (Math.random()*1000);
			array2[i] = (int)(Math.random()*1000);

		}
		BubbleSort(array);//冒泡排序
		System.out.println("冒泡排序后数组中最大的三个为： "+array[array.length-1]+" "+array[array.length-2]+" "+array[array.length-3]);
		new ArrayTest().ArraySort(array2);
		System.out.println("Arrays.sort()排序后数组中最大的三个为： "+array2[array2.length-1]+" "+array2[array2.length-2]+" "+array2[array2.length-3]);

	}

}
