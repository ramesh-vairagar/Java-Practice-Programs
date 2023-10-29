package pack4;

/*                     String handling in java 
                 --------------------------------------
                 |                 |                |
           String Class      String builder       String buffer
               |
           String created using String CLass is immutable
           in 4 ways we can create string 
 */
public class STRING
{
	void meth1()
	{
		String s1 = "java";  //1st way of creating string  
		
		String s2 = new String("java");  //2nd way
		
		char arr[] = {'j','a','v','a'}; 
		String s3 = new String(arr);     //3rd way
		
		String s4 = new String(arr,2,2); //4thb way  we can pass only array
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		
		System.out.println(s1.length()); //length() method used to get the size of string
		System.out.println("java is awesome".length());
		System.out.println("-------------------------");
		meth2();
		
	}
	void meth2()
	{
		String s = "java";
		System.out.println("before concatination:-"+s);
		System.out.println(s.concat(" is awesome")) ;  //concat() combine to strings
		s = s.concat(" is awesome");
		System.out.println("after concatination:-"+s);
	}
	public static void main(String[] args) 
	{
		new STRING().meth1();
		
	}

}
//length() method used to get the size of string
//concat() combine to strings














