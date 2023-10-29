package pack4;

//input bob-------> hello bob!

public class String3 
{
	public String name(String name)
	{
		return "hello "+name+" !";
	}
	public static void main(String[] args) 
	{
		System.out.println(new String3().name("bob"));
		
	}

}

//output:-------------->   hello bob !
