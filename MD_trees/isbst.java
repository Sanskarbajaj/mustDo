package MD_trees;

import java.util.ArrayList;

import dsa.btimpl.Node;
import dsa.btimpl;

public class isbst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btimpl bt=new btimpl();
		System.out.println(izbst(bt.root));

	}public static ArrayList<Integer>al=new ArrayList<Integer>();
	public static void isbst(Node node)
	{
		if(node==null)
			return;
		isbst(node.left);
		al.add(node.data);  
		isbst(node.right);
	}
	public static boolean izbst(Node node)
	{boolean flag=false;
	isbst(node);
	System.out.println(al);
		for(int i=0;i<al.size()-1;i++)
		{
			if(al.get(i)<al.get(i+1))
				{
				flag=true;
				}
			
			else
			{
				al.clear();
				return false;
			}
		}
		al.clear();
	return flag;}
	

}
