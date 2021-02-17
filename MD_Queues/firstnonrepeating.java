package MD_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class firstnonrepeating {

	public static void main(String[] args) {
		
		firstNonRepeat("aac");

	}
	public static void firstNonRepeat(String str)
	{// String ans="";   Either we can store it in a string or just simply print it
	char res=0;
		Queue<Character>q=new LinkedList<>();
		q.add(str.charAt(0));
		//ans=ans+str.charAt(0);
		System.out.println(q.peek());
		for(int i=1;i<str.length();i++)
		{
			if(q.isEmpty()||str.charAt(i)!=q.peek())
			{
				q.add(str.charAt(i));
				System.out.println(q.peek());
				//ans=ans+q.peek();	
			}
			else
			{
				System.out.println("-1");
				//ans=ans+"-1";
				if(!q.isEmpty())
				res=q.poll();continue;
			}
			q.add(str.charAt(i));
		}
	//	System.out.println(ans);
	}

}
