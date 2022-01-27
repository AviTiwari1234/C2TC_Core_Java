import java.util.Scanner;
public class CustomizeException {

	public static void main(String[] args) 
	{
		int age;
		System.out.println("Enter Your Age");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You cannot cast your vote........");
		}
		else
		{
			System.out.println("You can happily vote.....");
		}

	}

}

class CantVote extends RuntimeException
{
	CantVote (String msg)
	{
		super(msg);
	}
}
