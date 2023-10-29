package multiThreading;

/*
	MULTITASKING:-performing one or more tasks simultaneously at same time with the single processor
				  is known as multitasking
				                |
	1)Multithreading                                   2)multiprocessing
		-a thread is smallest unit of process
		-process acts as a host for thread
		-at least one process is required to create thread
		-context switching is easy
		   => we can create thread in two ways
		       1) By extending thread class present in java.lang package
		       2) By implementing Runnable interface(Functional interface only one abstract method present)           
		            
*/                

public class ClassA extends Thread  //1]creating normal class and extending Thread class present in java.lang
{
	public void run()               //2]overriding method public void run present in Thread
	{
		for(int i=1;i<=5;i++)
			System.out.println("run executed"+i);
		
	}
	public static void main(String[] args) 
	{
		ClassA aobj = new ClassA();   //3]creating an object of child class
		Thread t1 = new Thread(aobj); //4]creating an object of Thread class and giving aobj as parameter 
		
		t1.start(); //new thread will be generated which runs classA run method 
		t1.run();   //no new thread will be generated but 
		
		System.out.println("---------------");
		Thread t2 =  new Thread();
	 	t2.start();  //a new thread will be created which is responsible for the implementation of Thread class run method  
		t2.run();   //no new thread will be generated but thread class run method will be called just like normal method
	}
	//whenever we are starting a thread with help of start() every Thread by default execute public void run()method
	
}
