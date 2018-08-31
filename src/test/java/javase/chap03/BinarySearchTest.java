package javase.chap03;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {

		int[] a=new int[128];
		for(int i = 0; i < a.length;i ++)
		{
			a[i] = i;
		}
		int n = (int)(Math.random() * 128);
		System.out.println(n);
		int i = BinarySearch.binSearch(a,0,a.length,n);
		System.out.println(i);

	}

}
