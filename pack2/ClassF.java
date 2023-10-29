package pack2;

public class ClassF 
{
	String meth1(int a,int b)
	{
		System.out.println(a+b);
		int i =new ClassF().meth2(1,7,3);
		System.out.println(i);
		return "java is awesome";
	}
	int meth2(int a,int b,int c)
	{
		System.out.println(a+b);
		return a+b+c;
	}
	public static void main(String[] args) {
		String s=new ClassF().meth1(99, 1);
		System.out.println(s);
		
	}

}
