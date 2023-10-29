package pack4;

import java.util.Arrays;

//arrays

public class Array2 
{
	void meth1(int arr[])
	{
		System.out.println("---meth1() called---");
		System.out.println(Arrays.toString(arr));
	}
	int [] meth2()
	{
		System.out.println("---meth2() called---");
		int data[]= {100,200,300};
		return data;
	}
	public static void main(String[] args) 
	{
		int input[] = {10,20,30};
		new Array2().meth1(input);
		System.out.println(Arrays.toString(new Array2().meth2()));
}

}
