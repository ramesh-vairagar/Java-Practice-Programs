package pack3;

//working for and for-each loop

public class ClassX2 
{
	void meth1()
	{
		int arr[]= {10,20,30,40,50}; //int array of length 5
		System.out.println(arr[0]);
		System.out.println("retrieving data from array usingfor loop");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nretrieving the data from array in reverse order");
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nretrieving data using for each lopp");
		//for loop will be working on index values of array
		//for each loop will be working on streaming of data
		for(int x:arr)   ///for-each loop
		{
			System.out.print(x+" ");
		}
		System.out.println("\nretreiving String data using for each lopp");
		String arr2[]= {"java","oracle","spring","html"};
		for(String s:arr2)
			System.out.print(s+" ");
	}
	public static void main(String[] args) 
	{
		new ClassX2().meth1();
		
	}

}
