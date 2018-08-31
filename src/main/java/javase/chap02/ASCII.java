package javase.chap02;

public class ASCII
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int counter = 0;
		for (int i = 31; i < 128; i++)
		{
			counter++;
			if (counter % 10 == 0)
				System.out.println();
			System.out.print((char) i + " ");
		}

	}

}
