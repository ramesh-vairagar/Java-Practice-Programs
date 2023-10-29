package opps;

//empname empsal empexp as private

public class Encapsulation2 
{
	private String EmpName;
	private int EmpExp;
	private int EmpSal;
	
	public String getEmpName() 
	{
		return EmpName;
	}
	public void setEmpName(String empName) 
	{
		EmpName = empName;
	}
	
	public int getEmpSal() 
	{	if(EmpExp>=5)
			return EmpSal+EmpSal*10/100;
		return EmpSal+EmpSal*5/100;
	}
	public void setEmpSal(int empSal) 
	{
		EmpSal = empSal;
	}
	
	public int getEmpExp() 
	{
		return EmpExp;
	}
	public void setEmpExp(int empExp) 
	{
		EmpExp = empExp;
	}
	
}
