package opps;

//it is a process of making fields as private and providing access to those fields with the help of public 
//methods through setters and getters method

public class Encapsulation 
{
	private String studentName;
	private int StudentRollno;
	private String StudentDept;
	
	
	public String getStudentName() 
	{
		return studentName;
	}
	public void setStudentName(String studentName) 
	{
		System.out.println("step-1");
		this.studentName = studentName;
	}
	
	public int getStudentRollno() 
	{
		return StudentRollno;
	}
	public void setStudentRollno(int studentRollno) 
	{
		System.out.println("step-2");
		StudentRollno = studentRollno;
	}
	
	public String getStudentDept() 
	{
		return StudentDept;
	}
	public void setStudentDept(String studentDept) 
	{
		System.out.println("step-3");
		StudentDept = studentDept;
	}
	

}
