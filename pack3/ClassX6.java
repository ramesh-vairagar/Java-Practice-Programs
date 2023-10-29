package pack3;

//program on loops

public class ClassX6
{
	void display()
	{
		int a=10;
		for(int k= (a++)+(++a)+(++a);k<100;k++)
		{
			System.out.println(k);
			break;   //whenever compiler came across break break statement it will be out from that particular block only 
		}
	}
	public static void main(String[] args) 
	{
		new ClassX6().display();
		
	}

}
