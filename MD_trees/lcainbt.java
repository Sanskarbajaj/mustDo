package MD_trees;

import dsa.btimpl.Node;
import dsa.btimpl;

public class lcainbt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		Node ans=lcabt(bt.root,3,4);
		System.out.println(ans.data);
		

	}
	public static Node lcabt(Node node,int n1,int n2)
	{
		if(node==null)
		return null;
		
		if(node.data==n1)
			return node;
		else if(node.data==n2)
			return node;
		
	Node lf=lcabt(node.left,n1,n2);
	Node rf=lcabt(node.right,n1,n2);
		
		if(lf==null&&rf==null)
			return null;
		else if(lf!=null&&rf==null)
			return lf;
		else if(rf!=null&&lf==null)
			return rf;
		else
			return node;
		
	}

}
