package pack3;

//pattern program using for loop

public class ClassX4 
{
	void display(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* " );
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new ClassX4().display(5);
		for(int i=0;i<7;i++)
				System.out.println(i);
				
		System.out.println("end");
	}

}
