package MD_trees;

import dsa.btimpl;
import dsa.btimpl.Node;

public class heightofbinaytree {
	btimpl b=new btimpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		bt.display();
		System.out.println(height(bt.root));

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

}
