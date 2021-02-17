package MD_Array;

public class rearrangearrayalternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		arrayarrangement(arr);
		for(int x:arr)
			System.out.print(x+" ");
	}
	//divident =deivident*divisor
	public static void arrayarrangement(int arr[])
	{
		int mini=0,maxi=arr.length-1;
		int me=arr[arr.length-1]+1;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				arr[i]=arr[i]+(arr[maxi]%me)*me;
				maxi--;
			}else
				
			{
				arr[i]=arr[i]+(arr[mini]%me)*me;
				mini++;
			}
		}
		
	}
}
