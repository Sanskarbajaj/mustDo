package MD_LinkedList;

import java.util.Stack;

import dsa.llimpl;
import dsa.llimpl.Node;

public class llispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  llimpl<Integer>ll=new llimpl<Integer>();
	  ll.addLast(1);
	  ll.addLast(2);
	  ll.addLast(1);
	  System.out.println(ispalindrome(ll.head));

	}
	public static boolean ispalindrome(Node head)
	{
		Stack<Integer> s=new Stack<Integer>();
		Node tm=head;
		while(tm!=null)
		{
			s.push((Integer) tm.data);
			tm=tm.next;
		}
		Node chk=head;
		System.out.println(s);
		while(chk!=null)
		{
			if(chk.data!=s.pop())
				return false;
			chk=chk.next;
		}
		
	return true;}

}
