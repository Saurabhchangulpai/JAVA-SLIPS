import java.util.*;
class tdemo extends Thread
{
	String name;
	int num;
	tdemo(String name,int num)
	{
		this.name=name;
		this.num=num;
	}
	public void run()
	{
		for(int i=0;i<num;i++)
		{
			System.out.println(name+" "+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
class slip8
{
	public static void main(String args[])
	{
		tdemo t1=new tdemo("COVID 19",10);
		tdemo t2=new tdemo("LOCKDOWN2020",20);
		tdemo t3=new tdemo("VACCINATED2021",30);
		t1.start();
		t2.start();
		t3.start();
	}
}
