package MD_trees;

import dsa.btimpl;
import dsa.btimpl.Node;

public class countleafnodes {
	btimpl bt=new btimpl();
	
	
	public static void main(String args[])
	{
		btimpl bt=new btimpl();
		bt.display();
		System.out.println(countleaf(bt.root));
		
	}
	static int count=0;
	public static int countleaf(Node node)
	{ 
		
		if(node==null)
			return 0;
		if(isleaf(node))
		{
			count++;
		}
		countleaf(node.left);
		countleaf(node.right);
		
	return count;}
	public static boolean isleaf(Node node)
	{
		return (node.left==null&&node.right==null);
	}

}
