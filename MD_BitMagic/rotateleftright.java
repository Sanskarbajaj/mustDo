package MD_BitMagic;

import java.util.Scanner;

public class rotateleftright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rot(34, 2);
		
	}
	public static void rot(int n,int k)
	{
		int l=n,r=n;
		if(k>16)
			k=k%16;
		l=l<<k;
		System.out.println(l);
		l=n;
		l=l>>k;
		System.out.println(l);
	}

}
