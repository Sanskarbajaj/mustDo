package MD_BitMagic;

import java.util.Scanner;

public class setkthbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int n=s.nextInt();
			int k=s.nextInt();
		   setkth(15, 2);		
		}
	
	}
	public static void setkth(int n,int k)
	{ 
		int mask=1;
		int pos=0;
		while(pos<k)
		{pos++;
		 mask=mask<<1;
		}
		if((n&mask)==0)
		{
			n=n|mask;
			System.out.println(n);
		}
		else
		{
			System.out.println(n);
		}
		
		
	}

}
