package multiThreading;

//join

public class ClassD1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ClassD Dobj = new ClassD();
		
		Dobj.start();   //calling Thread class method with child class object
		
		Dobj.join();   //it will stop the current thread execution i.e main thread
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("ClassB main"+i);
		}
	}

}
