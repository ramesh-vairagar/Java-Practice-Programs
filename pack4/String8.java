package pack4;

//first two
//hello------>he
//ra--------->ra
//r--------->r

public class String8 
{
	String firstTwo(String s)
	{
		if(s.length()>2)
			return s.substring(0,2);
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println(new String8().firstTwo("hello"));
		
	}
}
