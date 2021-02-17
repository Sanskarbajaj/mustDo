package MD_LinkedList;

import java.util.LinkedList;

public class queueasll {
	LinkedList<Integer>l=new LinkedList();
	
	public int size()
	{
		
		return l.size();
	}

	public void enqueue(int item)
	{
		l.addLast(item);
	}
	public int dequeue()
	{
		return l.removeFirst();
	}
	public int front()
	{
		return l.getFirst();
	}
	public void display()
	{
		System.out.println(l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
queueasll q= new queueasll();
q.enqueue(1);
q.enqueue(2);q.enqueue(30);q.enqueue(4);q.enqueue(5);q.enqueue(6);
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());
	System.out.println(q.size());

	System.out.println(q.front());
	q.display();
	}

}
