import java.util.*;
class slip3
{
	public static void main(String args[])
	{
		LinkedList <String> ls=new LinkedList<String>();
		ls.add("Hello");
		System.out.println(ls);
		ls.add("sir");
		System.out.println(ls);
		ls.addLast("GM");
		System.out.println(ls);
		ls.removeFirst();
		System.out.println(ls);
		ListIterator <String> Itr=ls.listIterator(ls.size());
		while(Itr.hasPrevious())
		{
			System.out.println(Itr.previous());
		}
	}
}
