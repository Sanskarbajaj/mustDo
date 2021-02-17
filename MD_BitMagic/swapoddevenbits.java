package MD_BitMagic;

import java.util.Scanner;

public class swapoddevenbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int n=s.nextInt();
			oddeve(n);
		}
	}
	public static int oddeve(int x)
	{
		{ 
	        // Get all even bits of x 
	        int even_bits = x & 0xAAAAAAAA;  
	      
	        // Get all odd bits of x 
	        int odd_bits = x & 0x55555555;  
	      
	        // Right shift even bits 
	        even_bits >>= 1;  
	          
	        // Left shift even bits 
	        odd_bits <<= 1;  
	          
	        // Combine even and odd bits 
	        return (even_bits | odd_bits);  
	    } 
	}

}
