package pack3;
//inheritance:-acquiring the properties of one class into another class
//parent class methods can be accessed by child class object

class ClassA          
{
	 void meth1()     
	{
		System.out.println("Class1 method called...");
		new ClassA().meth2();
	}
	  private void meth2()
	 {
		 System.out.println("hii");
		 
	 }
	//public static void main(String[] args) 
	 {
		//new ClassA().meth1();
	 }
}


