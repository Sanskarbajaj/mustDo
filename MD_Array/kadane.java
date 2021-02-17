package MD_Array;

public class kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,-1,4,-2,6,7};
		System.out.println(maxsumsubarray(arr));

	}
	public static int maxsumsubarray(int arr[])
	{
		
		int msf=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			msf=msf+arr[i];
			if(msf>max)
			{
				max=msf;
			}
			if(msf<0)
			{
				msf=0;
			}
		}
	return max;}

}
