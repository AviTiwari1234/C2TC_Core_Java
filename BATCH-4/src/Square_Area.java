import java.util.Scanner;									//fully qualified name
public class Square_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter the side of the square =");
		   double side = scanner.nextDouble();
		 
		   
		   double area = side*side;
		   System.out.println("Area of Square ="+area);// concatenation

	}

}
