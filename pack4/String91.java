package pack4;

//equals() in String compare content
//equlas() is StringBuilder compare address location
public class String91 
{
	void meth1()
	{
		String s1 = new String("java");
		StringBuffer buffer1 = new StringBuffer("java");
		StringBuilder builder1 = new StringBuilder("java");
		
		String s2 = new String("java");
		StringBuffer buffer2 = new StringBuffer();
		StringBuilder builder2=new StringBuilder();
		
		System.out.println("String");
		System.out.println(s1.equals(s2));    //true
		System.out.println(s1==s2);//false compare address location
		
		System.out.println("StringBUilder");
		System.out.println(buffer1.equals(buffer2)); //false compare address location
		System.out.println(buffer1==buffer2);        //false compare address location
		System.out.println(buffer1.toString().equals(buffer1.toString())); //true compares content
		
		System.out.println("StringBuilder");
		System.out.println(builder1.equals(builder2));//false
		System.out.println(builder1==builder2);
		System.out.println(builder1.toString().equals(builder2.toString()));//true compares content
	}
	public static void main(String[] args) 
	{
		new String91().meth1();
		
	}
}
