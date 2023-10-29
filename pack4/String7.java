package pack4;

//hello--->lololo
public class String7 
{
	String extraend(String s)
	{
		String str = s.substring(s.length()-2);
		return str+str+str;
	}
	public static void main(String[] args) 
	{
		System.out.println(new String7().extraend("ramesh"));
		
	}

}
