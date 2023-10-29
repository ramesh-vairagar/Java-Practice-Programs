package pack3;

//problem on this

public class ClassZ8 
{
	int meth1(int a,int b)
	{
		System.out.println("meth1 clled");
		System.out.println(b);
		System.out.println(100);
		return (a+b)+10+(a-b);
	}
	int meth2()
	{
		System.out.println("meth2 called");
		return meth3(10)+8;
	}
	ClassZ8()
	{
		//this("java is awesome");
		System.out.println(50);
	}
	String meth4(int a,String s)
	{
		System.out.println("meth4 called");
		a=a+4;
		System.out.println("a val"+a);
		System.out.println("s val"+s);
		return s+"is object oriented";
		
	}
	
	int meth3(int a)
	{
		String res=this.meth4(this.meth1(this.meth2(), this.meth3(5)+'A'-'a'), "java");
		System.out.println(res);
		return a;
	
	}

}
