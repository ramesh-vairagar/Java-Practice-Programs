package pack3;

//object class present in java.lang package and its a parent class to all java classes
//we can access methods inside object class by every other class

//1] hashcode():-return type int -->gives unique identification number for given object.

public class ClassD 
{
	void meth1()
	{
		System.out.println("ClassA method");
	}
	public static void main(String[] args) 
	{
		ClassA aobj1=new ClassA();
		ClassA aobj2=new ClassA();
		aobj1=aobj2;
		int aobj1code=aobj1.hashCode();
		int aobj2code=aobj2.hashCode();
		System.out.println("hashcode of aobj1="+aobj1code);
		System.out.println("hashcode of aobj2="+aobj2code);
	}
}
