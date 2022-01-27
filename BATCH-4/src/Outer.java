
public class Outer {
	
	int x=10;
	static int y=200;

	
					static class inner
					{
						public void method_demo()
						{
							System.out.println("I am inner class");
							y=100;
							System.out.println(y);
					
						}
					}

	public static void main(String[] args) {
		
		Outer.inner obj=new Outer.inner();
		obj.method_demo();
		
		

	}

}
