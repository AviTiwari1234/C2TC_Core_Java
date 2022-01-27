import java.util.Scanner;
public class Pattern2
{
public static void main(String args[])
{
int n, i, j, ws= 1;
System.out.print("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
ws = n - 1;
for (j = 1; j<= n; j++)
{
for (i = 1; i<=ws; i++)
{
System.out.print(" ");
}
ws--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
ws = 1;
for (j = 1; j<= n - 1; j++)
{
for (i = 1; i<= ws; i++)
{
System.out.print(" ");
}
ws++;
for (i = 1; i<= 2 * (n - j) - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
}
}