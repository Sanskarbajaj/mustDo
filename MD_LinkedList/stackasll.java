package MD_LinkedList;

import com.sun.javafx.scene.traversal.TopMostTraversalEngine;

import dsa.llimpl;

public class stackasll {
	llimpl<Integer>l=new llimpl<Integer>();
	public int top()
	{
		return l.size()-1;
	}
	public void push(int item)
	{
		l.addLast(item);
	}
	public int pop() throws Exception
	{
		return l.removelast();
	}
	public int size()
	{
		return l.size();
	}
public void display()
{
	l.display();
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stackasll s=new stackasll();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.top());
		s.push(4);
		s.push(5);
		s.push(6);
		s.display();
		System.out.println(s.top());
	}

}
