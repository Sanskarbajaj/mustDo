package MD_LinkedList;

import dsa.llimpl;

public class middleelement extends llimpl<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer>ll=new llimpl<>();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		Node node=ll.head;
System.out.println(middle(node));
	}
	public static int middle(Node head)
	{
		Node fast=head,slow=head;
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		while(fast.next!=null&&fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		if(count%2==0)
			return slow.next.data;
	return slow.data;}
}
