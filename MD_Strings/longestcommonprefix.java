package MD_Strings;

public class longestcommonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"geeks","geek","gee"};
		System.out.println(lcprefix(arr));

	}
	public static int minlen(String arr[])
	{
		int min=arr[0].length();
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i].length())
			  min=arr[i].length();
		}
	return min;}
	public static String lcprefix(String str[])
	{
		int min=minlen(str);
		System.out.println(min);
		String res="";
		Character cur;
		for(int i=0;i<min;i++)
		{
			cur=str[0].charAt(i);
			for(int j=1;j<str.length;j++)
			{
				if(str[j].charAt(i)!=cur)
					return res;
			}
			res=res+cur;
		}
	return res;}

}
