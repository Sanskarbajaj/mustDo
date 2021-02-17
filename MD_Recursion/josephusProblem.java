package MD_Recursion;

public class josephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Jprob(5, 2));

	}
 public static int Jprob(int n,int k)
 {
	 if(n==1)
	  return 1;
	 return ((Jprob(n-1, k)+k-1)%n+1);
 }
}
