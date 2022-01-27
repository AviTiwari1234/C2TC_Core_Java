
public class String3 {

	public static void main(String[] args) {
	StringBuffer s1= new StringBuffer ("Avantika");
	
	StringBuffer s2= new StringBuffer ("Avantika");
	
	System.out.println(s1==s2);			//Reference comparison

	System.out.println(s1.equals(s2)); // Content Comparison.....overridden for content 
	}

}
