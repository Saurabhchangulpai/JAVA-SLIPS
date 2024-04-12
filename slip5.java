import java.util.*;
class slip5
{
	public static void main(String args[])
	{
		Hashtable <String,String> ht=new Hashtable<String,String>();
		ht.put("Saurabh","8421053474");
		ht.put("Shailesh","55665556");
		
		Enumeration<String> names=ht.keys();
		while(names.hasMoreElements())
		{
			String name=names.nextElement();
			String Phone=ht.get(name);
			System.out.println("Name= "+name+" Phone= "+Phone);
		}
		
	}
}
