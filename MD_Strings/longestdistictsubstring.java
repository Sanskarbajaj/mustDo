package MD_Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class longestdistictsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lds("geeksforgeeks"));

	}
	public static int lds(String str)
	{
		int i=0,j=0,max=0;
		Set<Character>st=new HashSet<>();
		while(i<str.length()&&j<str.length())
		{
			if(!st.contains(str.charAt(j)))
			{
				st.add(str.charAt(j));
				j++;
				max=Math.max(max,j-i);
	
			}
			else
			{
				st.remove(str.charAt(i));
				i++;
			}
		}
		
	
	
	return max;}

}
