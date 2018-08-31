package javase.chap03;
/**
 * BinarySearch 类提供了数组的二分法查找功能
 * @author kuexun
 *
 */
public class BinarySearch {
	/**
	 * 
	 * @param a 数组
	 * @param start 开始下标
	 * @param end 结尾下标
	 * @param key 要查找的数字
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
