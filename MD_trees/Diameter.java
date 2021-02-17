package MD_trees;

import dsa.btimpl;
import dsa.btimpl.Node;

public class Diameter {
btimpl bt=new btimpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		System.out.println(diameter(bt.root));
		bt.display();

	}
	public static int diameter(Node node)
	{
		if(node==null)
			return 0;
		
		int lh=height(node.left);
		int rh=height(node.right);
		int ld=diameter(node.left);
		int rd=diameter(node.right);
		int myheight=Math.max(lh+rh+1,Math.max(ld,rd));
		return myheight;
		
		
		
	}
	public static int height (Node node)
	{
		if(node==null)
			return 0;
		int lh=height(node.left);
		int rh=height(node.right);
		int myheight=Math.max(lh,rh)+1;
		return myheight;
		
	}
//  1 true 2 true 3 true 4 true 5 false false false false true 6 true 7 false true 8 false false false true 9 false false

}
