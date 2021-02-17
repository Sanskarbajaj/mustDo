package MD_Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class kthlargestinstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stubA
		ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(1);
	al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);
	kthlargest(al, 4);
	
	}
public static void kthlargest(ArrayList<Integer>al,int k)
{
	ArrayList<Integer>res=new ArrayList<Integer>();
	
	for(int i=0;i<al.size();i++)
	{
		if(i+1<k)
		{
			System.out.print("-1"+"->");
			res.add(al.get(i));
		}
		else
		{res.add(al.get(i));
			System.out.print(kth(res,k)+"->");
		}
	}
	
	
}
public static int kth(ArrayList<Integer>all,int k)
{
	PriorityQueue<Integer>p=new PriorityQueue<Integer>(Collections.reverseOrder());
	for(int i=0;i<all.size();i++)
	{
	p.add(all.get(i));
	}
	int c=0;
	int res=0;
	while(c!=k)
	{
		if(!p.isEmpty())
		res=p.poll();
		c++;
	}
	p.clear();
return res;}
}
