package pack4;



//return true if 6 appears as first or last element in given array

public class Array3 
{
	boolean firstlast6(int arr[])
	{
		if(arr[0]==6 || arr[arr.length-1]==6 )
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		Array3 obj = new Array3();
		int input[]= {10,20,06};
		boolean flag=obj.firstlast6(input);
		System.out.println(flag);
	}
	

}
