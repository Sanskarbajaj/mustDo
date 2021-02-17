package MD_Recursion;

public class floodfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1 ,2 ,3 ,4 },{1 ,2 ,3 ,4 },{1 ,2 ,3 ,4 },{1, 3 ,2 ,4}};
int ans[][]=ffill(arr, 0, 2, 9,arr[0][2]);

for(int i=0;i<ans.length;i++)
{
	for(int j=0;j<ans[0].length;j++)
	{
		System.out.print(ans[i][j]+" ");
		
	}
		
}
	}
	public static int[][] ffill(int arr[][],int x,int y,int k,int z)
	{
		if(x>arr.length-1||y>arr[0].length-1||x<0||y<0)
		{
			return null;
		}
		if(arr[x][y]!=z)
		{
			return null;
		}
		else
		{
			arr[x][y]=k;
		}
	ffill(arr, x+1, y, k,z);
	ffill(arr, x, y+1, k,z);
	ffill(arr, x-1, y, k,z);
	ffill(arr, x, y-1, k,z);
return arr;}
}
