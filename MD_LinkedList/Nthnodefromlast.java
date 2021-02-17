package MD_LinkedList;

import dsa.llimpl;
import dsa.llimpl.Node;

public class Nthnodefromlast extends llimpl<Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer>ll=new llimpl<Integer>();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		Node node=ll.head;
	//	System.out.println(nthfromlast(node,2));
		

	}

	public   int nthfromlast(Node head,int x)
	{ 
		Node ans=getNodeAt(this.size-x);


	return (int) ans.data;}

}
