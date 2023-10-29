package pack2;

public class ClassN 
{
	int meth1(int a,int b)
	{
		System.out.println(a);
		System.out.println(a-b);
		return new ClassN().meth4(a-1,"hi");
	}
	String meth2(int x)
	{
		System.out.println(x-new ClassN().meth1(200,199));
		System.out.println(x);
		return "java";
	}
	 String meth3(int a,int b,String s)
	 {
		 System.out.println(a);
		 System.out.println(a+b);
		 return "is";
	 }
	 int meth4(int a,String s)
	 {
		 System.out.println(a);
		 System.out.println(s);
		 return a+a;
	 }
	 String meth5(String s)
	 {
		 return s;
	 }
	 public static void main(String[] args) {
		//System.out.println(new ClassN.meth5(new ClassN().meth3(15,25, new ClassN().meth2(500))));
	}
	 

}
