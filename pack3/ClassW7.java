package pack3;

//program to show grade of students according to marks  

public class ClassW7 
{
	char marks(int m)
	{
		if(m>=25 && m<45)
			return 'E';          //in else if statements next else if statement will only executed if previous is not satisfied
		else if(m>=45 && m<50)
			return 'D';
		else if(m>=50 && m<60)
			return 'C';
		else if(m>=60 && m<80)
			return 'B';
		else if(m>80)
			return'A';
		else
			return 'f';
}
	public static void main(String[] args) 
	{
		ClassW7 obj= new ClassW7();
		char c=obj.marks(24);
		System.out.println("your grade is "+c );
	}

}
