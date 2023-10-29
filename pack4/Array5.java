package pack4;

//return the sum of first two elements in an array if the length less than 2 then return array itself

public class Array5 
{

	int sumTwo(int arr[])
	{
		if(arr.length<2)
			return arr[0];
		return arr[0]+arr[1];
	}
	public static void main(String[] args) 
	{
		int inp[] = {10,20};
		System.out.println(new Array5().sumTwo(inp));
		
	}
}
