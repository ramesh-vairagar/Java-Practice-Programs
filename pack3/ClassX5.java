package pack3;

//working of jump and continue statements

public class ClassX5 
{
	void meth1()
	{
		System.out.println("implmenting ump statements");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				continue;
				//return;
			}
			System.out.println("i="+i);
		}
		System.out.println("compiler came out from for loop");
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		new ClassX5().meth1();
		
	}

}
