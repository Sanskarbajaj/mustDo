package MD_Array;

public class nopairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {2,1,6};
		int y[]= {1,5};
		System.out.println(nopairs(x, y));
		}

	
	public static int nopairs(int x[],int y[])
	{
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(Math.pow(x[i], y[j])>Math.pow(y[j], x[i]))
				{
					count++;
				}
			}
		}
	return count;}

}
