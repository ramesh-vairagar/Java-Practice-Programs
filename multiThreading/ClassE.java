package multiThreading;

//sleep():- if we want a thread to pause performing any action for a given amount of time then we should use sleep() method

public class ClassE 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("j");
		Thread.sleep(1000);  //1sec
		System.out.println("a");
		Thread.sleep(5000);
		System.out.println("v");
		Thread.sleep(1000,500); //10 sec
		System.out.println("a");
		
	}

}
