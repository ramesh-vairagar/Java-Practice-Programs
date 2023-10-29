package pack3;

//a company will decided to give bonus of 5% to employee if his service is more 
//than 5 years take parameterized method which takes salary and years of service

public class ClassW5 
{

	void bonus(int sal,int yr)
	{
		int final_sal=sal;
		if(yr>5)
		{
			final_sal = sal+(sal*5/100);
		}
		System.out.println("your final salary is:" +final_sal);
	
	}
	public static void main(String[] args) 
	{
		ClassW5 obj = new ClassW5();
		obj.bonus(10000,6);
		
	}
}
