package MD_Heaps;

import java.util.ArrayList;

public class heapsort {
ArrayList<Integer>heap=new ArrayList<Integer>();


public void add(int item)
{
	heap.add(item);
	upheapify(heap.size()-1);
}
	public void upheapify(int ci)
	{
		
		
		int pi=ci/2;
		if(heap.get(pi)>heap.get(ci))
		{
			 swap(pi,ci);
				upheapify(pi);
		}
	}
	public void swap(int i,int j)
	{
	int ith=heap.get(i);int jth=heap.get(j);
	heap.set(i, jth);
	heap.set(j, ith);
	}
public void display()
{
	System.out.println(heap);
}
public int remove()
{
	swap(0,heap.size()-1);
	int rv=heap.get(heap.size()-1);
	heap.remove(heap.size()-1);
	downheapify(0);
	
return rv;}
public void downheapify(int pi)
{
	int lc=2*pi+1;
	int rc=2*pi+2;
	int mini=pi;
	if(lc<heap.size()&&heap.get(lc)<heap.get(mini))
		mini=lc;
	if(rc<heap.size()&&heap.get(rc)<heap.get(mini))
		mini=rc;
	
	if(mini!=pi)
	{
		swap(mini,pi);
		downheapify(mini);
	}
	
}
public static void main(String[] args) {	
	heapsort h=new heapsort();
	h.add(1);
	h.add(2);
	h.add(3);
	h.add(4);
	h.add(5);
	h.add(7);
	h.add(6);
	h.display();
	


}

}
