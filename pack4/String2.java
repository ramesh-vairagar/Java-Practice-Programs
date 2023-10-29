package pack4;

import java.util.Arrays;

/*methods in String Class
   1]length()--->returns length of string
   2]concat()--->combine two string
   3]charAt(index)-->return char of index position
   4]s1.startsWith("str")---->return true if given string starts with str
   5]s1.toUpperCase()-----> convert to upper case
   6]s1.toLowerCase()------>convert to lower case 
   7]s3.substring(7,10)--->create substring start with 7 index
   8]+s6.trim()-----> it removes unwanted spaces start and end
   9]+s4.replace('a', 'A')---> all the a in s4 replace with A
   10]s1.indexOf('o')-----> return the first occurance index value of given char
   11] s1.lastIndexOf('o')-->
*/
public class String2 
{
	void meth1()
	{
		String s1 = "Java";
		String s2 = new String("java");
		
		System.out.println("length()="+s1.length());
		System.out.println("length()="+s1.concat(" is awesome").length());
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("i love java".concat(" because it is awesome").length());
		
		System.out.println("charAt()="+s1.charAt(0));
		System.out.println("charAt()="+s1.charAt(s1.length()-1));
		System.out.println("charAt()="+s1.charAt(s1.length()-1)+3);
		
		System.out.println("startsWith()="+s1.startsWith("ja"));
		System.out.println("startsWith()="+s1.startsWith(s2));
		System.out.println("startswith="+s2.startsWith("java"));
		System.out.println("startsWith()="+s1.startsWith(new String(new char[] {'j','a','v','a'})));
		
		System.out.println("toLowerCase="+s1.toLowerCase());
		System.out.println("s1="+s1);
		System.out.println("toUppercase="+s1.toUpperCase());
		System.out.println("s1="+s1);
		
		String s3 = "I Love India";
		
		System.out.println("substring()="+s3.substring(2));
		System.out.println("substring()="+s3.substring(7,10));
		
		String s4 = "java is awesome";
		
		System.out.println("substring()="+s4.substring(9,11));
		System.out.println("substring()="+s4.substring(11));
		System.out.println("substring()="+s4.substring(11, s4.length()));
		
		System.out.println("replace()="+s4.replace('a', 'A'));
		System.out.println("replace()="+s4.replace('a',	(char)65));
		
		
		System.out.println("s4="+s4);
		String s5=s4.replace('e', 'E');
		System.out.println("s5="+s5);
		
		String s6 =" hello world ";
		System.out.println("s6 length()="+s6.length());
		System.out.println("aftert trim()="+s6.trim().length());
		
		System.out.println("indexOf()="+s6.indexOf('o'));//first occurance
		System.out.println("lastIndexOf="+s6.lastIndexOf('o'));//last occurance
		
		String s7 = "ABCDEF";
		byte arr[] = s7.getBytes();  //convert string into bytes
		System.out.println("arr="+Arrays.toString(arr));
		for(byte x:arr)
		{
			System.out.print(x+" ");
			//System.out.print((char)x+" ");
		}
		
	}
	public static void main(String[] args)
	{
		new String2().meth1();
		
	}

}
