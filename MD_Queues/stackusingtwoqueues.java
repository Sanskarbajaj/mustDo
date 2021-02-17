package MD_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class stackusingtwoqueues {
Queue<Integer> q=new LinkedList<>();
	public static void main(String[] args) {
		stackusingtwoqueues s=new stackusingtwoqueues();
		s.push(1);s.push(2);s.push(3);s.push(4);s.push(5);
s.display();
System.out.println(s.pop());
System.out.println(s.pop());
System.out.println("***********");

s.display();
	}

	public void push(int item)
	{
		((LinkedList<Integer>) q).addLast(item);
	}
	public int pop()
	{
		return((LinkedList<Integer>) q).removeLast();
	}
	public void display()
	{
		System.out.println(q);
	}
	
}
