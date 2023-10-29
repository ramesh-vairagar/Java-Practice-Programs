package pack4;

import java.util.Arrays;

//rotate given array to left

public class Array8 
{
	int [] rotate(int [] arr)
	{
		int res[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[res.length-1-i]=arr[i];		
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(new Array8().rotate(new int [] {10,20,30})));
		
	}

}
