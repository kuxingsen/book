package javase.chap02;


import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class RandomKey
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("6Ϊ������������");
		char [] str = new char[6];
		TreeSet<String> treeSet = new TreeSet<String>();
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(j%2==0)
					str[j] = (char)('0'+new Random().nextInt(10));
				else
					str[j] = (char)('A'+new Random().nextInt(26));

			}
			String string = new String(str);

			if(!treeSet.add(string))//��������ظ��Ļ���������
				i--;
			else
				System.out.println(string);

		}
	}

}
