package MD_DivideAndConquer;

public class Binarysrch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(bsearch(arr,3,0,arr.length));

	}
	public static int bsearch(int arr[],int item,int beg,int end)
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
		else if(arr[mid]>item)
		{
		return	bsearch(arr, item,beg,mid-1);
		}
		else
		{
		return	bsearch(arr, item,mid+1,end);

		}
	}

}
