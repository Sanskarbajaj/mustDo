package MD_BitMagic;

public class firstrightbitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fstsetr(12);

	}
	public static void fstsetr(int n)
	{
		int mask=1;
		int pos=1;
		while((n&mask)==0)
		{
			pos++;
			mask=mask<<1;
		}
		System.out.println(pos);
	}

}
