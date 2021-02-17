package MD_trees;

import dsa.btimpl;
import dsa.btimpl.Node;

public class convertmirror {
	btimpl bt=new btimpl();
	public static void main(String argd[])
	{
		btimpl bt=new btimpl();
		bt.display();
		mirrortree(bt.root);
		bt.display(bt.root);
		
	}
	public static void mirrortree(Node node)
	{
		if(node==null)
			return;
		
		mirrortree(node.left);
		mirrortree(node.right);
		swap(node.left,node.right);
		
	}
	public static void swap(Node i,Node j)
	{
		Node t=i;
		i=j;
		j=t;
	}

}
