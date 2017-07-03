package deque;
import java.util.*;


public class dequedemo {

	public static void main(String []args)
	{
		Deque<String> dl=new ArrayDeque<String>();
		dl.addFirst("mayank");
		dl.addLast("sumit");
		dl.offerFirst("hello");
		dl.offerLast("world");
		System.out.println("head is:"+dl.element());
		System.out.println("head is:"+dl.peekFirst());
		System.out.println("last is:"+dl.peekLast());
		System.out.println("last is:"+dl.getLast());
		
		
		Iterator <String>itr=dl.iterator();
		
		while(itr.hasNext())
		{System.out.println(itr.next());
		
		
		}
		
		dl.removeFirst();
		dl.pollLast();
		Iterator<String> itr2=dl.descendingIterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}
