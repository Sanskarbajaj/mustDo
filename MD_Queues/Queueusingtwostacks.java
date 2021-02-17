package MD_Queues;

import java.util.Stack;

public class Queueusingtwostacks {

	 Stack<Integer>s=new Stack<Integer>();
	Stack<Integer>h=new Stack<Integer>();
	public static void main(String[] args) {
		Queueusingtwostacks q =new Queueusingtwostacks();
		q.enqueue(1);q.enqueue(2);q.enqueue(3);q.enqueue(4);q.enqueue(5);
		q.display();
		System.out.println(q.dequeue());
		q.dequeue();
		q.enqueue(6);
System.out.println("++++++++++++++");
		q.display();

	}
	public   void enqueue(int item)
	{
		s.push(item);
	}
	public int dequeue()
	{
		while(s.size()!=1)
		{
			h.push(s.pop());
		}
		int rv=s.pop();
		while(!h.isEmpty())
			s.push(h.pop());
		return rv;
	}
	public void display()
	{
		System.out.println(s);
	}

}
