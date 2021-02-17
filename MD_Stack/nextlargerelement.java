package MD_Stack;
import java.util.Stack;
public class nextlargerelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,2,1};
		nextgreater(arr);
	}
	public static void nextgreater(int arr[])
	{
		Stack<Integer>s=new Stack<>();
		s.add(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
	     if(arr[i]<s.peek())
	     {
	    	 s.push(arr[i]);
	     }
	     else
	     {
	    	 while(!s.isEmpty()&&arr[i]>s.peek())
	    	 {
	    		 s.pop();
	    		 System.out.println(arr[i]);
	    	 }
	    	 s.push(arr[i]);
	     }
		}
		while(!s.isEmpty())
		{
			s.pop();
			System.out.println("-1");
		}
	}

}
