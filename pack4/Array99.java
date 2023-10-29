package pack4;

import java.util.Arrays;

//[1,20,30]------->[0,0,0,0,0,30]

public class Array99 
{
	static int [] meth1(int a[])
	{
		int b[] = new int[a.length*2];
		b[b.length-1]=a[a.length-1];
		return b;
	}
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40};
		int result[] = meth1(arr);
		System.out.println(Arrays.toString(result));
	}

}
