package MD_trees;

import java.util.LinkedList;
import java.util.Queue;

import dsa.btimpl;
import dsa.btimpl.Node;

public class levelorderspiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		levelorderspiral.levelspiral(bt.root);
	}
	public static void levelspiral(Node node)
	{ int sc=0;
		Queue<Node>q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty())
		{
			Node ans=q.poll();
			System.out.print(ans.data+"->");
			if(sc%2==0)
			{
				if(ans.left!=null)
					q.add(ans.left);
					if(ans.right!=null)
					q.add(ans.right);
					sc++;
				
			}
			else
			{
				if(ans.right!=null)
					q.add(ans.right);
					if(ans.left!=null)
					q.add(ans.left);
					sc++;
			}
				}
	}

}
