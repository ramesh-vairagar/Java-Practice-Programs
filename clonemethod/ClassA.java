package clonemethod;

//clone() method is used to create exactly similar kind of clone of an object
//clone() creates an clone for existing object and initialize its fields with exact same content of its respective class object


public class ClassA implements Cloneable  //for cloning Class Should be inheriting marker interface that is cloneable
{
	int x;
	int y;
	ClassA(int num1,int num2)
	{
		x=num1;
		y=num2;
	}
	ClassA shows() throws CloneNotSupportedException 
	{
		ClassA aobj = new ClassA();
	}
}
