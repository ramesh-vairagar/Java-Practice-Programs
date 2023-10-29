package pack3;

//1)equals():-return type "boolean" it will check whether both object are 
//present at same address location or not


public class ClassE 
{
	protected void meth2()
	{
		System.out.println("protected method");
	}
	public static void main(String[] args) 
	{
		ClassA aobj1=new ClassA();
		ClassA aobj2=new ClassB();
		
		boolean b=aobj1.equals(aobj2);
		System.out.println(b);
		System.out.println();
		
		System.out.println(aobj1.equals(aobj1));
		System.out.println();
		
		System.out.println(new ClassA().equals(new ClassA()));
		System.out.println();
		
		System.out.println(aobj2.equals(new ClassA()));
		System.out.println();
		
		aobj1=aobj2;
		System.out.println(aobj1.equals(aobj2));
	}
}
