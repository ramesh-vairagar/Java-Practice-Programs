package pack4;

import java.util.Arrays;

/*  Array:- array collects multiple elements of same data type
	int arr[] = new int[5] ---->1st way
	int arr[] = {10,20} ------->2nd way
	int arr[]= new int[]{1,2,3}-->3rd way
	int arr[] --->4th way
	arr = new int[5]
	
	arr.length------> used to get length of array
	Arrays.toString(arr1)---->used to view the data from an array
*/
public class AARAYS 
{
	void meth1()
	{
		System.out.println("implementing java array");
		int arr1 [];
		arr1 = new int[5];  //1st way
		
		int arr2[] =new int[5];  //2nd way
		
		int arr3[] = {10,20,30,40}; //3rd way
		
		int arr4[]= new int[] {10,20,30,40,50}; //4th way
		
		String s="java";
		
		System.out.println("------------length------------");
		
		System.out.println("length of s="+s.length());
		System.out.println("length of arr1="+arr1.length);
		System.out.println("length of arr2="+arr2.length);
		System.out.println("length of arr3="+arr3.length);
		System.out.println("length of arr4="+arr4.length);
		
		System.out.println("------retrieving data from an array--------");
		System.out.println(arr1[0]);
		arr1[1]=20;
		arr1[2]=40;
		System.out.println("arr1 data="+Arrays.toString(arr1));
		System.out.println("arr2 data="+Arrays.toString(arr2));
		System.out.println("arr3 data="+Arrays.toString(arr3));
		System.out.println("arr4 data="+Arrays.toString(arr4));
		System.out.println(arr2[3]);
		//System.out.println(arr3[arr2.length-1]); //AIOB exception
		System.out.println(arr4['A'-61]);
		
		System.out.println("--retrieving data from array using for loop--");
		for(int i=0;i<arr4.length;i++)
			System.out.print(arr4[i]+" ");
		System.out.println();
		
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
		System.out.println();
		
		for(int x:arr1)   //using for each loop
			System.out.print(x+" ");
	}
	public static void main(String[] args) 
	{
		new AARAYS().meth1();
		
	}
}









