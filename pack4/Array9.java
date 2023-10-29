package pack4;

import java.util.Arrays;

//return an array 3 1 4

public class Array9
{
	int [] makepi()
	{
		return new int[] {3,1,4};
	}
	public static void main(String[] args) 
	{
		System.out.println(Arrays.toString(new Array9().makepi()));
		int arr[] = new int[] {10,20,30};
		int arr1[] = {10,20,30};
		System.out.println(arr1.hashCode());
		System.out.println(arr.hashCode());
		System.out.println(new int[] {10,20,30}.equals(new int[] {10,20,30}));

		
	}

}
