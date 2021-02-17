package MD_BitMagic;

import java.util.Scanner;

public class kthbitsetornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t--!=0)
{
	int n=s.nextInt();
	int k=s.nextInt();
	boolean ans=kthset(n, k);
	if(ans==true)
		System.out.println("Yes");
	else
		System.out.println("No");
}
	}
   public static boolean kthset(int n,int k)
   {
	   n=n>>k;
	   if((n&1)==1)
		   return true;
	   return false;
   }
}
