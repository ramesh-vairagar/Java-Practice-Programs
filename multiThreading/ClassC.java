package multiThreading;

// thread scheduler : it will decide which thread should starts its execution basing on two conditions
//	1]Thread priorities:                     2]underlying OS:
//       -varies between 1 to 10
//		 -min=1 max=10 normal=5

public class ClassC extends Thread 
{
	 
	 public void run()
	 {
		 String name = Thread.currentThread().getName();  //currentThread is static method present in Thread class which returns instance of class
         												 //getName() return type String instance method
		 int priority = Thread.currentThread().getPriority();
		 
		 for(int i=1;i<5;i++)
		 {
			 System.out.println(name+"("+priority+")"+"has executed:-"+i);
		 }
		 
	 }
	 
	 
	public static void main(String[] args) 
	{
		ClassC cobj = new ClassC();
		
		Thread t1 = new Thread(cobj);
		Thread t2 = new Thread(cobj);
		
		t1.setName("First-thread");      //setName() present in Thread class return type void 
		t2.setName("second-thread");
		
		t1.setPriority(MIN_PRIORITY);   //setPriority() present in Thread class
		t2.setPriority(10);
		
		t2.start();  
		t1.start();
	}
	//since we are setting the priority but its totally depends on Os to decide which thread should be getting executed

}
