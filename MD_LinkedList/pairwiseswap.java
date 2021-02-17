package MD_LinkedList;

import dsa.HashTable.pair;
import dsa.llimpl;
import dsa.llimpl.Node;

public class pairwiseswap {
llimpl<Integer>ll=new llimpl<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer>l=new llimpl<Integer>();
		l.addLast(1);
		l.addLast(2);l.addLast(3);l.addLast(4);l.addLast(5);l.addLast(6);
		pairwiseswap(l.head);
		l.display();

	}
	public static Node pairwiseswap(Node head)
	{
		Node slow=head,fast=head.next;
		while(fast.next!=null&&fast.next.next!=null&&slow.next!=null&&slow.next.next!=null)
		{
			int tem=(int) slow.data;
			slow.data=fast.data;
			fast.data=tem;
			fast=fast.next.next;
			slow=slow.next.next;
			
		}	
		return head;	}
}
