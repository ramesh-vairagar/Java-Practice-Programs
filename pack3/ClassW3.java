package pack3;

//program to find largest number among three

public class ClassW3 
{
	void meth1(int a, int b,int c)
	{
		if(a>b)
			if(a>c)
				System.out.println(a+" is greater among three");
			else
				System.out.println(c+" is greater among three");
		else
			if(b>c)
				System.out.println(b+" is greater");
			else
				System.out.println(c+" is greater");
			
	}
	public static void main(String[] args) 
	{
		new ClassW3().meth1(-20,500,200);
	}
}
