package pack3;

//initializing instance variable using this

public class ClassZ7 
{
	private String name;
	ClassZ7()
	{
		this("abdul kalam azad");
		display();  //by default this provided by compiler
		
	}
	ClassZ7(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("name="+name);
	}
	public static void main(String[] args) 
	{
		new ClassZ7();
	}

}
