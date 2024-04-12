import java.util.*;
import java.io.*;
class slip7 extends Thread
{
	public static void main(String args[])
	{
		while(true)
		{
			try{
						Random r=new Random();
						int num=r.nextInt(10);
						Thread t1=new Thread(()->{
								try{
										System.out.println("The number is : "+num);
										Thread.sleep(2000);
								}catch(Exception e){}
							
						});
						Thread t2=new Thread(()->{
							try{
								if(num%2==0)
								{
									System.out.println("Number is even:");
									System.out.println("Squared of number is : "+num*num);
									Thread.sleep(2000);
								}
							}catch(Exception e){}
						});
						Thread t3=new Thread(()->{
							try{
								if(num%2!=0)
								{
									System.out.println("Number is odd:");
									System.out.println("Cube of number is : "+num*num*num);
									Thread.sleep(2000);
								}
							}
							catch(Exception e){}
						});
						t1.start();
						t2.start();
						t3.start();
				Thread.sleep(3000);//continoues
			}
			catch(Exception e)
			{
				
			}
		}
	}	
}
