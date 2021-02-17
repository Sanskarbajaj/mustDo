package MD_trees;

import java.util.ArrayList;

import dsa.btimpl;
import dsa.btimpl.Node;

public class identicaltrees {
	btimpl bt=new btimpl();
	
	public static void main(String args[])
	{
		btimpl bt1=new btimpl();
		btimpl bt2=new btimpl();
		System.out.println(isidentical(bt1.root,bt2.root));
		
	}
	public static boolean isidentical(Node node1,Node node2)
	{ preorder(node1, node2);
//		preorder(node1);
//		Object[] one=res.toArray();
//	int os=one.length;
//		res.clear();
//		preorder(node2);
//		Object[] two=res.toArray();
//		int ts=two.length;
//		res.clear();
//		if(os!=ts)
//			return false;
//		boolean flag = false;	
//		for(int i=0;i<os;i++)
//		{
//			if(one[i]==(two[i]))
//				flag=true;
//			else
//				return false;
//		}
			
	return flagg;}
	static ArrayList<Integer>res=new ArrayList<>();
	static boolean flagg=false;
	public static void preorder(Node node1,Node node2)
	{
		if(node1==null)
			return;
		if(node1.data==node2.data)
		{
			flagg=true;
		}
		else
		{
			flagg =false;
			return;
		}
		res.add(node1.data);
		preorder(node1.left,node2.left);
		preorder(node1.right,node2.right);
	}
	

}
