import java.util.*;
class slip28 extends Thread
{
	public void run()
	{
		System.out.println("Running Thread name is : "+Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		slip28 s=new slip28();
		s.setName("T1");
		s.start();
	}
}
