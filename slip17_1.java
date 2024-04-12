import java.util.*;
class slip17_1
{
	public static void main(String args[])
	{
		Set <Integer> s=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number whos added in set : ");
			int num=sc.nextInt();
			s.add(num);
		}
		System.out.println(s);
	}
}
