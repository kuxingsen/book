package javase.chap02;

public class Dice
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int []array = new int [6];
		for(int i=0;i<6000;i++)
		{
			int num = (int) (Math.random()*6);
			array[num]++;
		}
		for(int i=0;i<array.length;i++) {
			System.out.printf("点数为%d出现的次数:%d",i+1,array[i]);
			System.out.println();
		}

	}

}
