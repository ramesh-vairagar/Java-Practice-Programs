package pack4;

import java.util.Scanner;

//check given string palendrome or not
//madam--->madam palendrome

public class String5 
{
	String meth1(String word)
	{
		String str ="";
		for(int i=word.length()-1;i>=0;i--)
			str=str+word.charAt(i);
		    //str=str.concat(new String(new char [] {word.charAt(i)}));
		if(str==word)
			return word + " is palendrome";
		return word + " is not palendrome";
			
	}
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			String5 obj = new String5();
			System.out.println("enter word which you want check");
			System.out.println(obj.meth1(sc.next()));
		}
		
	}
}
