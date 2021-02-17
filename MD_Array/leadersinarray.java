package MD_Array;

import java.util.ArrayList;

public class leadersinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,12,3,4,7,1,6};
		System.out.println(leaders(arr));

	}
	public static ArrayList<Integer> leaders(int arr[])
	{
	  int mfr=arr[arr.length-1];
	  ArrayList<Integer>al=new ArrayList<>();
	  al.add(mfr);
	  for(int i=arr.length-2;i>=0;i--)
	  {
		  if(arr[i]>mfr)
		  {
			  al.add(arr[i]);
			  mfr=arr[i];
		  }
	  }
	return al;}

}
