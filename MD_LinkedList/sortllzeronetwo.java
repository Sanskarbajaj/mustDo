package MD_LinkedList;


import dsa.llimpl;
import dsa.llimpl.Node;

public class sortllzeronetwo {
	llimpl<Integer>ll=new llimpl<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer> l=new llimpl<>();
		l.addLast(1);
		l.addLast(2);
		l.addLast(0);
		l.addLast(2);
		l.addLast(0);
		l.head=segregate(l.head);
	l.display();

	}
	public static Node segregate(Node head)
	{
		Node tm=head;
		int arr[]=new int[3];
		while(tm!=null)
		{
			if(tm.data.equals(0))
			{
				arr[0]++;
				tm=tm.next;
			}
			
			else if(tm.data.equals(1))
			{
				arr[1]++;
				tm=tm.next;
			}
			else
			{
				arr[2]++;
				tm=tm.next;
			}
		}
		tm=head;
		int z=arr[0];
		int o=arr[1];
		int t=arr[2];
		System.out.println(z);System.out.println(o);
		System.out.println(t);
		while(tm!=null)
		{
			if(z!=0)
			{
				tm.data=0;
				z--;
				tm=tm.next;
			}
			else if(o!=0)
			{
				tm.data=1;
				o--;
				tm=tm.next;
				
			}
			else
			{
				tm.data=2;
				t--;
				tm=tm.next;
			}
			
		}
	return head;}
	
}
