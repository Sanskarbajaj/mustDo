package MD_DivideAndConquer;

import java.util.Scanner;

public class elementappearsonceinsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{ 
		   int n=s.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<arr.length;i++)
		   arr[i]=s.nextInt();
		   System.out.println(ans(arr));
		}
	}
	public static int ans(int arr[])
	{
		int a=arr[0];
		for(int i=1;i<arr.length;i++)
			a=a^arr[i];
	return a;}

}
