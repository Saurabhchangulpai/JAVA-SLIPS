import java.util.*;
class slip13_2 extends Thread
{
	String name;
	slip13_2(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println("Thread "+name+" is created ");
		Random r=new Random();
		int sleepTime=r.nextInt(5000);
		System.out.println("Thread "+name+" is sleep for "+sleepTime+" time");
		try{
			Thread.sleep(sleepTime);
		}catch(Exception e){}
		System.out.println("Thread "+name+" is dead ");
	}
	public static void main(String args[])
	{
		slip13_2 t1 =new slip13_2("hello");
		t1.start();
	}
}
