package pack3;

//a student will not allow to sit in exam if his attendance is less than 75%
//write a method which will take no. of classes and no.of classes attended

public class ClassW6 
{
	void EligibleForExam(int total,int attend)
	{
		int percentage= (attend*100)/total;
		if(percentage>75)
			System.out.println("your aeligible for eaxam as your attendence is "+percentage+"%");
		else
			System.out.println("you are not eligible as your attendence is "+percentage+"%");
	}
	public static void main(String[] args) 
	{
		ClassW6 obj=new ClassW6();
		obj.EligibleForExam(90, 70);
	}

}
