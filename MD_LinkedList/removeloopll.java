package MD_LinkedList;

import dsa.llimpl;
import dsa.llimpl.Node;

public class removeloopll {
	llimpl<Integer>ll=new llimpl<Integer>();
	public static void main(String args[])
	{
		llimpl<Integer>l=new llimpl<Integer>();
		
		
	}
	public static void removeloop(Node head)
	{
		Node fast=head,slow=head;
		Node ptr1=head,ptr2 = null;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				ptr2=fast;
				break;
				
			}
		}
		while(ptr2.next!=ptr1.next)
		{
			ptr2=ptr2.next.next;
			ptr1=ptr1.next;
			if(ptr2.next==ptr1.next)
			{
				ptr2.next=null;
				break;
			}
		}
	}

}
