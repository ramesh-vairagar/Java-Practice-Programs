package pack4;

//capacity() and length()
//setCharAt(int index, char ch)
//charAt()
//reverse()
//delete(int begin,int end)
//deleteCharAt(int index)
//setLength(int length)
//replace(1,3,"Java")
//insert(1,"Java")
public class String92 
{
	void meth1()
	{
		StringBuffer bf = new StringBuffer();
		//default capacity of bufferString is 16 i.e it stores 16 character
		
		System.out.println("capacity of buffer="+bf.capacity());  //16
		System.out.println("length() of buffer="+bf.length());    //0
		
		bf.append("abcdefghijklmnop");
		System.out.println("buffer="+bf);
		System.out.println("capacity="+bf.capacity());//16
		System.out.println("length()="+bf.length());  //16
		
		bf.append("q");
		//(currentcapacity+1)*2
		System.out.println("capacity()="+bf.capacity()); //34
		System.out.println("length()="+bf.length());  //17
		
		System.out.println("charAt():"+bf.charAt(0));
		System.out.println("reverse():"+bf.reverse());
		System.out.println("charAt():"+bf.charAt(0));
		System.out.println("-----------------------------");
		
		StringBuffer bf2 = new StringBuffer("java is awesome");
	
		bf2.setCharAt(0, 'a');
		System.out.println("setCharAt()="+bf2);
		bf2.setCharAt(0, 'j');
		System.out.println("setCharAt()="+bf2);
		
		System.out.println("length()="+bf2.length());
		System.out.println("deleteCharAt()="+bf2.deleteCharAt(14));
		System.out.println("length="+bf2.length());
		System.out.println("delete()="+bf2.delete(0, 5));
		
		bf2.setLength(2);
		System.out.println("setLength()="+bf2);
		System.out.println("length()"+bf2.length());
		
		StringBuilder bf3 = new StringBuilder("java");
		System.out.println("length()"+bf3.length());
		System.out.println("replace()"+bf3.replace(1,3,"hello"));
		System.out.println("length()"+bf3.length());
	
		System.out.println("insert()"+bf3.insert(0,"java"));
	}
	
	

	public static void main(String[] args) 
	{
		new String92().meth1();
		
		
	}
}
