import java.util.Scanner;  
public class Array1   
{  
public static void main(String[] args)   
{  
int size;  
Scanner s=new Scanner(System.in);  
System.out.print("Enter the size of the Array");  
size=s.nextInt();  
int[] array = new int[10];  

	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<size; i++)  
	{  

			array[i]=s.nextInt();  
	}  

 
	for (int i=0; i<size; i++)   
	{  
			System.out.println(array[i]);  
	}	  
}  
}  