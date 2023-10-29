package pack3;


//child class class3 inheriting properties from class Class2 parent class


public class ClassB extends ClassA   //extends - keyword  ClassA-parent Class 
{
	void meth2() //ClassB method
	{
		System.out.println("Class2 method called");
	}
	public static void main(String[] args) 
	{
		ClassA aobj = new ClassA();  //Creating ClassA object in ClassB
		aobj.meth1();
		System.out.println("------------------");
		ClassB bobj = new ClassB();  //ClassB object 
		bobj.meth1();    //calling meth1 (ClassA method) by ClassB object
		bobj.meth2();    //calling meth2())
	}

}
