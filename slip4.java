import java.util.*;
class slip4
{
	public static void main(String args[])
	{
		Map<String,Integer> mp=new HashMap<String,Integer>();
		mp.put("Ahmednagar",414606);
		mp.put("Loharwadi",461625);
		mp.put("Chanda",414607);
		mp.put("Ghodegoan",414646);
		System.out.println(mp);
		
		int choice;
		System.out.println("1.Add one city and thier STD ");
		System.out.println("2.Remove city from location ");
		System.out.println("3.Search for city display there STD ");
		
		
		
		while(true)
		{
			System.out.println("Enter the choice from above : ");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Name of city : ");
					String city=sc.next();
					System.out.println("Enter the "+city+" STD  : ");
					int STD=sc.nextInt();
					mp.put(city,STD);
					System.out.println(mp);
					break;
				case 2:
					System.out.println("Enter the city : ");
					String city1=sc.next();  
					mp.remove(city1);
					System.out.println(mp);
					break;
				case 3:
					System.out.println("Enter the city you want to search : ");
					String city2=sc.next();
					if(mp.containsKey(city2))
					{
						System.out.println(mp.get(city2));
					}
					System.out.println(mp);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter correct choice from above ");
			}
		}
	}
}
