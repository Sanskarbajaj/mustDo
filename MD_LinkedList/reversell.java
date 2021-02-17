package MD_LinkedList;

import dsa.llimpl;
import dsa.llimpl.Node;

public  class reversell  {
	llimpl<Integer>l=new llimpl<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer>ll=new llimpl<Integer>();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);

	}
	public static Node reverse(Node head,int n) throws Exception
	{
		Node tm=head;
		int l=0,r=n;
		while(l<=r)
		{
			Node lf=this.getNodeAt(l);
			Node rf=this.getNodeAt(r);
			T tem=(T) lf.data;
			lf.data=rf.data;
			rf.data=(T) tem;
			l++;
			r--;
		}
		
		return this.head;
	}
	

}
