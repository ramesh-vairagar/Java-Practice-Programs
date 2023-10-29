package pack3;

//toString():-return type String--it converts an object into string 
//represented format
public class ClassG 
{
	public String toString() //manually
	{
		System.err.println("toString called");
		return getClass().getName()+'@'+Integer.toHexString(hashCode());
	}
	public static void main(String[] args) 
	{
		ClassG obj= new ClassG();
		String s = obj.toString();
		
		System.out.println("toString() ="+s);
		
		//System.out.println(obj);
		
		System.out.println("toString() ="+new ClassG().toString());
		
		//System.out.println(obj.getClass());
	}

}