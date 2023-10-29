package pack3;

//loops

public class ClassX7 
{
	void meth1(int b)
	{
		int a=10;
		while(a<=20)
		{
			if(a==15)
			{
				while(b<=30)
				{
					if(b==25)
					{
						break;
					}
					System.out.println("b val="+b);
					b++;
				}
			}
			System.out.println("a val="+a);
			a++;
		}
	}
	public static void main(String[] args) 
	{
		new ClassX7().meth1(20);
	}

}
