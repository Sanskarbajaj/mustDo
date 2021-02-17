package MD_Queues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class lrucache {
HashMap<Integer,Integer> hm=new HashMap<>();
ArrayList<Integer>al=new ArrayList<>();
int k;
public lrucache(int k) {
	this.k=k;
}
Queue<Integer>q=new LinkedList<>();
	public static void main(String[] args) {
		lrucache l=new lrucache(2);
		l.set(1, 2);
		//l.display();
		l.set(2, 3);
	//	l.display();
		l.set(3, 5);
	//	l.display();
		l.set(4, 5);
		l.display();
System.out.println(l.get(4));
l.display();
	}
	public void set(Integer x,Integer y)
	{
		
		if(q.size()<k&&!q.contains(x))
		{
			q.add(x);
			hm.put(x,y);
		}
		else
		{
			hm.remove(q.peek());
			q.poll();
		     q.add(x);
			hm.put(x,y);
		}
	
	}
	public int get(int x)
	{	
		if(hm.containsKey(x))
		{	
			int val= hm.get(x);
			int key=x;
			return val;
		}
	return -1;}
	public void display()
	{
		System.out.println(q);
		System.out.println(hm);
	}

}
