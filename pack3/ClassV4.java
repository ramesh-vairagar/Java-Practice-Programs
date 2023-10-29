package pack3;

//static variable

public class ClassV4 
{
	static int x=10;  //static variable only one copy //20  
	
	public static void main(String[] args) 
	{
		ClassV4 t1 = new ClassV4();
		ClassV4 t2 = new ClassV4();
		t1.x=20;
		System.out.println(x);
		System.out.println(t2.x);
		
	}
	
}
