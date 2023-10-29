package pack3;

//program to print multiplication table 2*1=2  2*2=2......

public class ClassX3 
{
	void multab(int num)
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args) 
	{
		new ClassX3().multab(20);
		
	}

}
