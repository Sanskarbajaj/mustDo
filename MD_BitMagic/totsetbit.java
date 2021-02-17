package MD_BitMagic;

import java.util.Scanner;

public class totsetbit {
	public static void main (String[] args)
	 {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t--!=0)
{
   int n=s.nextInt();
   int sum=0;
   for(int i=0;i<=n;i++)
   {
       sum=sum+cb(i);
   }
   System.out.println(sum);
   
}
	 }
	 public static int cb(int n)
	 {
	     if(n==0)
	     return 0;
	     int c=0;
	     while(n!=0)
	     {
	         if((n&1)==1)
	         c++;
	         
	         n=n>>1;
	     }
return c;	 }

}
