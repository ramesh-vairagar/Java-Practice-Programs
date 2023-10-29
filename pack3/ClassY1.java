//understanding java packages. it consist of similar types of classes,interfaces and sub packages

package pack3;
import pack2.ClassY2; //1st way of importing package
import pack2.*;       //2nd way of importing package

public class ClassY1 
{
	public static void main(String[] args) 
	{
		new ClassY2().meth1();  //classY2 is present in pack2 package
		pack2.ClassY3 obj = new pack2.ClassY3();  //3rd way of importing package without import statement
		obj.meth2();
	}

}
