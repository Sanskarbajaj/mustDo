package MD_Strings;

import java.util.ArrayList;

public class removeadjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(removeadjacent("geeksforgeeks"));
	}
	public static String removeadjacent(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<sb.length()-1;i++)
		{
			int j=i;
			if(sb.charAt(i)==sb.charAt(i+1))
			while(j<sb.length()-1&&sb.charAt(j)==sb.charAt(j+1))
			{
				if(j==sb.length()-1)
				{
					
				}else
				j++;
			}
			if(j!=i)
			{
				sb.delete(i,j+1);
				i--;
			}
		}
	return sb.toString();}
}
