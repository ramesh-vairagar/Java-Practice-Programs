package pack2;

public class ClassG 
{
	int meth1(int a,int b) //main 99 1
	{
		return a+b;
	}
	public static void main(String[] args) {
		ClassG obj=new ClassG();
		int i=obj.meth1(99, 1);
		System.out.println(i);
	}

}
