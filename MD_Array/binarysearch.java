package MD_Array;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(binarysearch(arr,0,arr.length-1,5));

	}
	public static int binarysearch(int arr[],int beg,int end,int item)
	{
		if(beg>end)
		{
			return -1;
		}
		int mid=(beg+end)/2;
		if(arr[mid]==item)
		{
			return mid;
		}
		else if(item>arr[mid])
		{
			binarysearch(arr,mid+1, end, item);
		}
		else
		{
			binarysearch(arr,beg,mid-1, item);
		}
	return mid;}

}
