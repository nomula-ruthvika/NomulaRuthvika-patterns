package creational;
class house
{
	void requirements()
	{
		System.out.println("furniture");
		System.out.println("parking slot");
		
	}
}
class building extends house
{
	void requirements()
	{
		System.out.println("trees");
		System.out.println("parking slot");
		
	}
	void requirements(int a)
	{
		System.out.println("furniture");
		System.out.println("gardening");
		System.out.println("entry gate");

	}
}
public class builder {
	public static void main(String args[])
	{
		building b=new building();
		building b1=new building();
		b.requirements();
		b1.requirements(10);
		
		
	}

}
