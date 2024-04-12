import java.util.*;
import java.io.*;
class slip19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList <Integer> ls=new LinkedList<>();
		int n;
		System.out.println("Enter the n :");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the num :");
			int num=sc.nextInt();
			if(num<0)
			{
				ls.add(num);
			}
		}
		System.out.println(ls);
	}
}
