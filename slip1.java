import java.util.*;
class thread extends Thread
{
	public void run()
	{
		for(char a='A' ; a<='Z'; a++)
		{
			System.out.println(a);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}	
	}
}
class slip1
{
	public static void main(String args[])
	{
		thread t1=new thread();
		t1.start();	
	}
}
