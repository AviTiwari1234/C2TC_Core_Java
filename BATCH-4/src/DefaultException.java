
public class DefaultException {

	public static void main(String[] args) 
	{
	
		m1();//metthod call to m1

	}
	public static void m1()
	{
		m2(); //method call to m2
	}

	public static void m2()
	{
		System.out.println(5/0);
	}
}
