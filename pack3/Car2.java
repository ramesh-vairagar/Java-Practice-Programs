package pack3;

//constructor

class Car2
{
	public static void main(String[] args) 
	{
		Car ford = new Car("ford");
		String name=ford.getbrand();
		System.out.println(name);
		ford.run();
	}
}
