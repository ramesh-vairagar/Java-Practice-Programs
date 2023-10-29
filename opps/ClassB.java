package opps;

//child class

public class ClassB extends ClassA
{
  void meth2()
  {
	  System.out.println("ClassB method");
  }
 
  public static void main(String[] args) 
  {
	ClassA aobj = new ClassA();  //creating ClassA object 
	aobj.meth1(); 
	
	ClassB bobj = new ClassB();
	bobj.meth1();  //accessing ClassA method by using ClassB object
	//bobj.meth1();  // accessing ClassB method
	
  }
}
