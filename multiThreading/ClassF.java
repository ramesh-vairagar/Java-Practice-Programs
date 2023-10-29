package multiThreading;

//interrupt():- an interrupt is an indication to a thread that it should stop what it was doing and do something else

public class ClassF extends Thread
{
	public void run()
	{
		System.out.println("i am ready for interview ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("this is my "+i+" interview");
		}
		System.out.println("i got placed");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("my sleep got disturb");
		}
		System.out.println("time to go for office");
	}
	public static void main(String[] args) 
	{
		ClassF fobj = new ClassF();
		Thread t = new Thread(fobj);
		t.start();
		t.interrupt();
	}
	

}
