package pack4;

//return the sum of elements in given array

public class Array7 
{
	int sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(new Array7().sum(new int[] {10,20,30}));
		
	}

}
