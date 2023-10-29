package pack2;

public class ClassL 
{
	int meth1(int a,int b)  //main 5,5
	{
		System.out.println("meth1() called");
		System.out.println(a*b);
		return new ClassL().meth2(100);
	}
	int meth2(int a) //meth1 100
	{
		System.out.println("meth2 () callled");
		System.out.println(new ClassL().meth3(500)+"awesome");
		return a-99;
	}
	String meth3(int a) //meth2 500
	{
		System.out.println("meth3() called");
		System.out.println(a);
		return "java";
	}
	public static void main(String[] args) {
		System.out.println(new ClassL().meth1(5, 5)+99);
	}
	
	

}
