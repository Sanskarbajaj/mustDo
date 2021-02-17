package MD_trees;

import dsa.btimpl;
import dsa.btimpl.Node;

public class balancedtree {
btimpl bt=new btimpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		System.out.println(isbalanced(bt.root));

	}
	public static boolean isbalanced(Node node)
	{
		int lh=height(node.left);
		int rh=height(node.right);
		System.out.println(lh);
		System.out.println(rh);
		if(Math.abs(lh-rh)>1)
			return false;
	return true;}
	public static int height (Node node)
	{
		if(node==null)
			return 0;
		int lh=height(node.left);
		int rh=height(node.right);
		int myheight=Math.max(lh,rh)+1;
		return myheight;
		
		
	}
}
