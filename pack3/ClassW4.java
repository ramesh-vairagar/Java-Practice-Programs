package pack3;

//WAP to accept length and breadth from parameters and check whether
//it is square or rectangle

public class ClassW4 
{
	void meth1(int l,int b)
	{
		if(l==b)
		{
			System.out.println("its a square");
		}
		else
		{
			System.out.println("its rectangle");
		}
	}
	public static void main(String[] args) 
	{
		new ClassW4().meth1(10,20);
		
	}

}
