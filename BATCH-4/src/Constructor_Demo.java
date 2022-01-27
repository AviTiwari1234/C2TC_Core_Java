
public class Constructor_Demo {
	
	
	String name;
	int roll;
	
	Constructor_Demo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Constructor_Demo s1=new Constructor_Demo("Avantika",101);
		Constructor_Demo s2= new Constructor_Demo("Mohini",102);
		
		
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);

	}

}
