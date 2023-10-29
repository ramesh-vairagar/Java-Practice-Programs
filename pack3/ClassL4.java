package pack3;

public class ClassL4 
{
	int empid;  //instance variable for every instance a separate copy of instance variable is created
	String empname;
	static String empcompany; //static variable there is only one copy available in entire program
	
	ClassL4(String name,int id,String cmp )
	{
		empname=name;
		empid=id;
		empcompany=cmp;
		System.out.println(empcompany);

		
		
	}
	public static void main(String[] args) 
	{
		ClassL4 obj1=new ClassL4("kishan",101,"tcs");
		
		ClassL4 obj2=new ClassL4("suatha",102,"wipro");
	
		ClassL4 obj3=new ClassL4("ramesh",103,"infosys");

		
		
		System.out.println(obj1.empname+" "+obj1.empid + " " +obj1.empcompany);
		System.out.println(obj2.empname+" "+obj2.empid + " " +obj2.empcompany);
		System.out.println(obj3.empname+" "+obj3.empid + " " +obj3.empcompany);
	}
}
