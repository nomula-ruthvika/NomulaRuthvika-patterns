package creational;

public class creational {
	creational()
	{
	System.out.println("in the default constructor");	
	}
	void create(int a)
	{
		System.out.println("in thhe parameter method");
		System.out.println("Hence,the constructor and method is acessed by only one object reference");
	}
	public static void main(String args[])
	{
	creational ob=new creational();
	ob.create(10);
	}
	

}
