package MD_trees;

import java.util.LinkedList;
import java.util.Queue;

import dsa.btimpl;
import dsa.btimpl.Node;

public class leftview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		leftview(bt.root);

	}
	public static void leftview(Node node)
	{  boolean vis[]=new boolean[heightofbinaytree.height(node)];
		Queue<Node>q=new LinkedList<>();
		int lvl=0;
		q.add(node);
		q.add(null);
		while(!q.isEmpty())
		{  
			Node ans=q.poll();
			if(ans!=null)
			{
				if(lvl<vis.length&&vis[lvl]==false)
				{
					System.out.println(ans.data);
					vis[lvl]=true;
				}
				if(ans.right!=null)
					q.add(ans.right);
					if(ans.left!=null)
					q.add(ans.left);
			}
			else
			{  if(q.size()==1&&ans==null)
				return;
				q.add(null);
				lvl++;
			}
				}
		}

}
