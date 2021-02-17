package MD_BitMagic;

public class longestconsecutive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lc1(222);

	}
	public static void lc1(int n)
	{
		int c=0;
		while(n!=0)
		{
			n=n&n<<1;
			c++;
			
		}
		System.out.println(c);
	}

}
