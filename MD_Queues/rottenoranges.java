package MD_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class rottenoranges {
public class pair
{
	int x;
	int y;
	public pair(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,1,0,2,1},{1,0,1,2,1},{1,0,0,2,1}};
		

	}
	public static int rottenorange(int arr[][])
	{ 
		Queue<pair>q=new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]==2)
				{
					pair p=new pair(i,j);
					q.add(p);
				}
			}
		}
		while(!q.isEmpty())
		{
			pair u = null,d = null,l = null,r = null;
			u.x=q.peek().x-1; u.y=q.peek().y;
			d.x=q.peek().x+1; u.y=q.peek().y;
			l.x=q.peek().x; u.y=q.peek().y-1;
			r.x=q.peek().x; u.y=q.peek().y+1;
			
		    
			
		}
		
		
		
		
		
		
	}

}
