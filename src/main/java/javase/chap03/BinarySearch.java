package javase.chap03;
/**
 * BinarySearch ���ṩ������Ķ��ַ����ҹ���
 * @author kuexun
 *
 */
public class BinarySearch {
	/**
	 * 
	 * @param a ����
	 * @param start ��ʼ�±�
	 * @param end ��β�±�
	 * @param key Ҫ���ҵ�����
	 * @return
	 */
	public static int binSearch(int[] a,int start,int end, int key)
	{
		int mid = start + (end-start)/2;
		if(key == a[mid])
		{
			return mid;
		}
		if(start >= end)
		{
			return -1;
		}
		if(key < a[mid])
		{
			return binSearch(a,start,mid-1,key);
		}else
		{
			return binSearch(a,mid+1,end,key);
		}
	}
}
