package MD_Hashing;

import java.util.HashMap;

public class firstrepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fstrep("geeksforgeeks");

	}
	public static void fstrep(String str)
	{
		int j=0;
		HashMap<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(!hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i),1);
			else
			{
				System.out.println(str.charAt(i));
				return;
			}
			j++;
		}
		if(j==str.length())
		System.out.println("-1");
		
	}

}
