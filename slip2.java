import java.util.*;
class slip2
{
	public static void main(String args[])
	{
		HashSet <String> hs=new HashSet<String>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name : ");
			String name=sc.next();
			hs.add(name);
		}
		TreeSet <String> ts=new TreeSet<String>();
		ts.addAll(hs);
		System.out.println(ts);
	}
}
