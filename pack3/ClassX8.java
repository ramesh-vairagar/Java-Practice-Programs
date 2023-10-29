package pack3;

//loops

public class ClassX8 
{
	void display()
	{
		int a=10;
		for(int k=(a++ + new ClassX8().meth1(5))+(++a+3)+(++a+3);k>10;k++)
		{
			System.out.println(k+6);
			break;
		}
		
	}
	int meth1(int a)
	{
		return meth2(10+1,15-3)+a*2;
	}

	public static void main(String[] args) 
	{	
		new ClassX8().display();
	}
	int meth2(int a,int b)
	{
		return a+b;
	}

}
