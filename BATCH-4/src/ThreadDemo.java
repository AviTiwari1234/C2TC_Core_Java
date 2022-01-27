
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("CHILD");

		}
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			
		}
	
}}

public class ThreadDemo   {

	public static void main(String[] args) throws InterruptedException
	{
	MyThread m=new MyThread();
	 m.start();
	 m.join();

	for(int i=0;i<10;i++)
	{
		System.out.println("MAIN");
	}
	
	}}
	


