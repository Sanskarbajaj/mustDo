package MD_LinkedList;

import dsa.llimpl;

public class rotatebyn extends llimpl<Integer>  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llimpl<Integer>ll=new llimpl<>();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		System.out.println(rotatebyn(ll.head,2));
	}
	public static int rotatebyn(Node head,int k)
	{
		Node nwhead,q;
		Node temp=head;
		int count=1;
		while(count!=k)
		{
			temp=temp.next;
			count++;
		}
		nwhead=temp.next;
		q=nwhead;
		temp.next=null;
		while(q.next!=null)
		{
			q=q.next;
		}
		q.next=head;
		return nwhead.data;
	}

}
