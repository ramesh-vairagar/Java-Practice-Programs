package pack3;

//getClass():-it provides a fully qualified class name for a given object
//getClass() is the method of Object class. This method returns the runtime class of 
//this object

public class ClassF 
{
	public static void main(String[] args) 
	{
		ClassF obj=new ClassF();
		
		Class a=new ClassF().getClass();
		System.out.println("class of object=="+a);
		
		Object obj1=new String("java");
		System.out.println("class of object="+obj1.getClass());
		
		
		System.out.println("getclass of object="+obj.getClass());
		
		System.out.println("getclass of object ="+new ClassE().getClass());
	}
	

}
