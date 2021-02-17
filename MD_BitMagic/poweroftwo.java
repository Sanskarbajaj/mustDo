package MD_BitMagic;

import java.util.Scanner;

public class poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static void pot(long n)
	{
		if(n==0)
		{
			System.out.println("NO");
			return;
		}
		if(n==1)
		{
			System.out.println("YES");
			return;
		}
		
		int c=0;
		while(n!=0)
		{
			if((n&1)==1)
				c++;
			n=n>>1;
		}
		if(c==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
