package pack3;

import pack2.ClassZ3;

//Access modifiers :- public method-->scope anywhere in program
//private method===>scope only in the class
//default==========>scope only within the package
//protected========>only in the inherited class

public class ClassZ extends ClassZ3
{
	public static void main(String[] args) 
	{
		
		//new ClassZ3().meth2();
		new ClassZ().meth2();
		new ClassZ1().meth2();
	}

}
