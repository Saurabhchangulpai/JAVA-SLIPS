import java.util.*;
import java.io.*;
class slip21
{
	public static void main(String args[])
	{
		LinkedList <String> ls=new LinkedList<>();
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the num :");
			int num=sc.nextInt();
			ls.add(num);
		}
		Iterator <String> itr=new Iterator<>();
		while(itr.hasNext())
		{
			System.out.println(ite.next());
		}
	}
}
