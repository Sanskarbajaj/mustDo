package MD_trees;

import dsa.bstimpl;
import dsa.bstimpl.Node;

public class lcainbst {
bstimpl bs=new bstimpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bstimpl bst=new bstimpl();
		bst.add(18);
		bst.add(8);
		bst.add(7);
		bst.add(10);
		bst.add(25);
		bst.add(20);
		bst.add(30);
		System.out.println(lcabst(bst.root, 7, 10));

	}
	public static int lcabst(Node node,int n1,int n2)
	{
		if(node==null)
			return 0;
		
		if(node.data>Math.max(n1,n2))
			return lcabst(node.left, n1, n2);
		else if(node.data<Math.min(n1,n2))
			return lcabst(node.right, n1, n2);
		else 
		{
			return node.data;
		}
			
	}

}
