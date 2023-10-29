package pack3;

//understanding static keyword
//static variable,final static variable

public class ClassS 
{
	//final static int c;   //jvm will not provid any default value 
	//we are getting error if we are using it without initializing 
	static int a;
	int b=0;
	
	ClassS()
	{
		
		a++;
		b++;
		System.out.println("static variable="+a);
		System.out.println("instance variable="+b);
		System.out.println("====================");
	}
	void display()
	{

		System.out.println("accessing Static values");
		System.out.println(ClassS.a); //accessing with class name
		System.out.println(a); //accessing with identifier
		System.out.println(new ClassS().a);
	}
	public static void main(String[] args) 
	{
		new ClassS();
		new ClassS();
		new ClassS();
		System.out.println("###################################");
		new ClassS().display();
		
	}

}
