import java.util.*;
class slip15 extends Thread
{
	public void run()
	{
		System.out.println("Running thread name is : "+Thread.currentThread().getName());
		System.out.println("Running thread priority is : "+Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		slip15 t1=new slip15();
		t1.setName("t1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		slip15 t2=new slip15();
		t2.setName("t2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}
}
