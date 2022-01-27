
public class Poly_Demo {
	
	void m()
	{
		System.out.println("No Parameters");
	}
	
	void m(int i)
	{
		System.out.println("Integer Parameters");
	}

	void m(float d)
	{
		System.out.println("Float Parameters");
	}


	public static void main(String[] args) {
	Poly_Demo p= new Poly_Demo();
			p.m(5);				//method call resolving
			p.m(5.6);
			
			
			p.m('a');
			p.m(10L);
			p.m(5.8f);
			p.m(2.0);

	}

}
