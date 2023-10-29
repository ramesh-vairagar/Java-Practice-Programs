package pack4;

/*  String s = "java";      =========> object created in SCP(string constant pool)--->there is no chance of duplicates
    String s = new String("java");===> object created in heap area as well as in SCP--->in heap area duplicates object possible
    
    equals() in object class compares address location of object
    equals() in String class compares contents of string
    " == " ---> compares address location of string object
    
    equalsIgnoreCase()--> ignores Capital and small just compare content
 */

public class String1 
{
	void meth1()
	{
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		String s4 = new String("java");
		
		System.out.println("------equals()----------- ");
		System.out.println(s1.equals(s2));  //true
		System.out.println(s3.equals(s4));  //true
		System.out.println("java".equals(s1)); //true
		System.out.println("java".equals("javA"));//false
		System.out.println("java".equalsIgnoreCase("jAvA"));//true
		System.out.println(s1.equals(s4)); //true
		System.out.println();
		
		System.out.println(">>comparing address locations of string<<");
		System.out.println(s1==s2);  //false
        System.out.println(s2==s3);  //false
		System.out.println(s2==s4);  //false
	    System.out.println(s1==s4);  //false
		System.out.println(s1==s3);  //true
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("---------------------");
		
		System.out.println(new String("java")==new String("java")); //false
		System.out.println("java"==new String("java"));  //false
		System.out.println("java"=="java");              //true
		System.out.println(s1=="java");                 //true
		System.out.println(s2==new String("java"));
		
	}
	public static void main(String[] args) 
	{
		new String1().meth1();
		
	}

}
