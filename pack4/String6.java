package pack4;

//input <<>> , java ----> <<java>>

public class String6 
{
	public String makewordout(String a,String b)
	{
		return a.substring(0,2)+b+a.substring(2);
	}
	public static void main(String[] args) 
	{
		System.out.println(new String6().makewordout("<<>>","ramesh"));
		
	}

}
