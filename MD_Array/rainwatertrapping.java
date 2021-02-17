package MD_Array;

public class rainwatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,0,0,2,0,4};
System.out.println(rwt(arr));	}
  public static int rwt(int arr[])
  {
	  int[] brr=new int[arr.length];
	  int[] crr=new int[arr.length];
	  int water=0;
	  for(int i=1;i<arr.length;i++)
	  {
		 brr[0]=arr[0];
		 brr[i]=Math.max(arr[i], brr[i-1]);
	  }
	  for(int i=arr.length-2;i>=0;i--)
	  {
		  crr[arr.length-1]=arr[arr.length-1];
		  crr[i]=Math.max(crr[i+1], arr[i]);
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		 water=water+Math.min(crr[i], brr[i])-arr[i];
	  }
  return water;}
}
