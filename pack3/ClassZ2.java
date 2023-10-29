package pack3;

//understanding this keyword : we can use this keyword in 4 ways
//1] to solve ambiguity between local and instance variable
//2]to access present class methods
//3]used return a instance of a given class 
//4]this() constructor call

public class ClassZ2 
{
	int a=10;//instance variable
	static int b=20;//static
	void meth1()
	{
		int a=100;//local
		int b=200;//
		System.out.println("instance variable="+this.a);  //accessing instance variable using this 
		System.out.println("static variable="+ClassZ2.b); //accessing static variable using class name 
		System.out.println("local variable="+a+" "+b);    //accessing static variable with this keyword is not recommended 
		
	}
	public static void main(String[] args) 
	{
		new ClassZ2().meth1();
		
	}

}
