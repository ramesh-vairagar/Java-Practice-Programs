package opps;


public class ClassB1 extends ClassA1
{
	void meth2() 
	{
		System.out.println("ClassB method");
	}

	public static void main(String[] args) 
	{
		ClassA1 aobj = new ClassA1();
		aobj.meth1();
		//we an hold a parent class object with a parent class reference and we can access only parent class methods
		
		ClassA1 aobj1 = new ClassB1();
		aobj1.meth1();
		//aobj.meth2();  ce
		//we can hold child class object with parent class reference and access paent class methods only
		
		ClassB1 bobj = new ClassB1();
		bobj.meth1();//ClassA method with b object
		bobj.meth2();//ClassB Method
		//we can access ClassA methods with ClassB object
	
		//ClassB1 Bobj = new ClassA1();
		//we cant hold parent object with child class reference 
	}
	
}