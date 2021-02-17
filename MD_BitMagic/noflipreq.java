package MD_BitMagic;

import java.util.Scanner;

public class noflipreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int m=s.nextInt();
			int n=s.nextInt();
		rdd(m, n);}
	}
	public static void rdd(int m,int n)
	{
		int pos=0;
		if(m==n)
		{
			System.out.println("-1"); return ;

		}
		while((m>n?m:n)!=0)
		{
			
			if((m&1)==(n&1))
			{
				m=m>>1;
				n=n>>1;
			}
			else
			{
			pos++;
			m=m>>1;
			n=n>>1;
			}
		}
		System.out.println(pos);	
	}
}
