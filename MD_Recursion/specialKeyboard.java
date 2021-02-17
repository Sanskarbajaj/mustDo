package MD_Recursion;

public class specialKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(spKbrd(8,2,Integer.MIN_VALUE));
	}
   public static int spKbrd(int n,int mul,int max)
   {
	   if(n==0)
	   {
		   return 0;
	   }
	   if(n<=6)
	   {
		   return n;
	   }
	   for(int i=n-3;i>=1;i--)
	   {
		    int ans=spKbrd(i,mul,max);
		    ans=ans*mul;
	   if(ans>max)
		   max=ans;
	   mul++;}
   return max;}
}
