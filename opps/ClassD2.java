package opps;

//inherited class
public class ClassD2 extends ClassD1    //child class 
{
	void meth1()
	{
		System.out.println("Class-B-Meth1 called");
	}
	void meth2()
	{
		System.out.println("Class-B-meth2 called");
	}
	public static void main(String[] args) 
	{
		ClassD1 aobj = new ClassD2(); //parent class reference holding child class object
		aobj.meth1(); 
		aobj.meth2();
		System.out.println("=-----------------=");
		ClassD1 D1obj = new ClassD1();   //parent class object
		D1obj.meth1();
		D1obj.meth2();
		System.out.println("========");
		new ClassD2().meth2();
	}
}
