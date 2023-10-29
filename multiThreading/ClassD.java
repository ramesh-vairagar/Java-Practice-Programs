package multiThreading;

//join():-join method allows the current executing thread to wait for the completion of another thread

public class ClassD extends Thread
{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("classA metthod "+i);
		}
	}
	
}
