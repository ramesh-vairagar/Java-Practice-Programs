package multiThreading;


// by implementing runnable interface
 
public class ClassB  implements Runnable  //implementing Runnable interface 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("run method executed "+i);
		}
	}
	public static void main(String[] args) 
	{
		ClassB bobj = new ClassB();
		Thread t1 =new Thread(bobj );
		t1.start();    //we are calling thread class start() method but by default run method executing 
		
	}
	
}
		


