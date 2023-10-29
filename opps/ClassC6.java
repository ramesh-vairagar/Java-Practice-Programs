package opps;

//superclassC

public class ClassC6 extends ClassC4  //child classC5
{
		void meth2()
		{
			new ClassC6();
			System.out.println("ClassC5 method");
			super.meth1();  //calling parent class method with super keyword
			
		}
		void meth3()
		{
			System.out.println("meth3() called");
		}
		ClassC6()
		{
			//super(); by default jvm will provide
		}
		ClassC6(int a)
		{
			//this();
			super(99,1);
			super.meth1();
			this.meth2();
			System.out.println("ClassC5 parameterized constructor");
			System.out.println(this);
		}
		public static void main(String[] args) 
		{
			ClassC6 cobj = new ClassC6(500);
			cobj.meth1();
	
		}
}

