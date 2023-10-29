package pack4;

//given two array a and b return true if the first or last element of array is same.

public class Array6 
{
	static boolean firstlast(int a[],int b[])
	{
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30};
		int arr1[] = {10,50,60};
		System.out.println(firstlast(arr,arr1));
				
	}

}
