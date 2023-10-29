package pack3;

//arithmetic and logical operator

public class ClassR 
{
	void meth1(int a)
	{
		if(a>=10)
		{
			System.out.println("if block as a="+a);	
		}
		else
		{
			System.out.println("else block as a="+a);
		}
		
	}
	void person(int age)
	{
		if(age>=18)
		{
			System.out.println("you are eligible for vote");
			
		}
		else
		{
			System.out.println("you are under aged as your age="+age);
		}
	}
	void govtexam(String name,int age)
	{
		if(age>=18 && age<=35)
		{
			System.out.println(name+" you are eligible");
		}
		else
		{
			System.out.println(name+" you are not eligible");
			
		}
		
	}
	void orop(int a)
	{
		if(!(a>10 || a<20))
		{
			System.out.println("hiiii");
			
		}
		else
		{
			System.out.println("else block");
		}
			
			
	}
	public static void main(String[] args) 
	{
		ClassR obj = new ClassR();
		obj.meth1(10);
		System.out.println();
		obj.person(35);
		System.out.println();
		obj.orop(10);
	}

}
