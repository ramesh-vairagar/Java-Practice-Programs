package pack4;

//return true if first and last element are same

public class Array4 
{
	boolean commonEnd(int []str)
	{
		if(str[0]==str[str.length-1])
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(new Array4().commonEnd(new int[] {10,20,30,10}));
		
		
	}
}
