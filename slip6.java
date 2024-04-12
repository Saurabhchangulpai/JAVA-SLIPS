import java.util.*;
class slip6
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  : ");
		n=sc.nextInt();
		Set <Integer> s=new TreeSet<Integer>();
		
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter the integer :");
			int num=sc.nextInt();
			s.add(num);
		}
		System.out.println("Sorted elements are : ");
		System.out.println(s);
		System.out.println("Enter the number to search : ");
		int sInt=sc.nextInt();
		if(s.contains(sInt))
		{
			System.out.println(sInt+" is present in the set");
		}
		else{
			System.out.println(sInt+" is not present in the set");
		}
	}
}
