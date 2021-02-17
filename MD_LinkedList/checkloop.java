package MD_LinkedList;

import dsa.llimpl;
import dsa.llimpl.Node;
public class checkloop {
llimpl<Integer>ll=new llimpl<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer>l=new llimpl<>();
		l.addLast(1);
		l.addLast(3);
		l.addLast(2);
		l.addLast(4);
		System.out.println(chkloop(l.head));
		

	}
public static boolean chkloop(Node head)
{
	Node slow=head;
	Node fast=head;
	while(fast.next!=null&&fast.next.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast)
		{
			return true;
		}
	}
return false;}

}
