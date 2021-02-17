package MD_LinkedList;

import dsa.llimpl;
import dsa.llimpl.Node;
public class mergesortedll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llimpl<Integer>f=new llimpl<>();
		llimpl<Integer>yo=new llimpl<>();
		f.addLast(1);f.addLast(4);f.addLast(5);
		llimpl<Integer>s=new llimpl<Integer>();
		s.addLast(2);s.addLast(6);s.addLast(7);
		Node fa=merge(f.head, s.head);
		yo.head=fa;
		yo.display();
		

	}
	public static Node merge(Node f,Node s)
	{ llimpl<Integer>ans=new llimpl<Integer>();
		int fc=0,sc=0;
		Node tf=f,ts=s;
		while(tf!=null)
		{
			fc++;
			tf=tf.next;
		}
		while(ts!=null)
		{
			sc++;
			ts=ts.next;
		}
			
		int i=0,j=0,k=0;
		while(i<fc&&j<sc)
		{
			if((int)f.data<(int)s.data)
			{
				ans.addLast((int)f.data);
				i++;
				f=f.next;
			}
			else
			{
				ans.addLast((int)s.data);
				j++;
				s=s.next;
			}
		}
		while(i<fc)
		{
			ans.addLast((int)f.data);
			f=f.next;
		}
		while(j<sc)
		{
			ans.addLast((int)s.data);
			j++;
			s=s.next;
		}
		
	return ans.head;}

}
