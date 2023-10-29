package pack3;

//this keyword is used to return the instance of the given class

public class ClassZ4 
{

	ClassZ4 meth1()    //ClassZ4 is return type we can use class name as return type also
	{
		System.out.println("meth1 called");
		ClassZ4 obj =new ClassZ4();
		System.out.println(obj);
		return obj;
		      //10   CE   //should return ClassZ4 object
	}
	ClassZ4 meth2()
	{
		System.out.println("meth2() called");
		System.out.println(this);
		return this;
	}
	void meth3()
	{
		System.out.println("meth3() called");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		//new ClassZ4().meth1().meth2().meth3(); //method chaining
		ClassZ4 obj=new ClassZ4();
		obj.meth1().meth2().meth3(); //method chaining
		System.out.println(obj);
		
	}
		

}
