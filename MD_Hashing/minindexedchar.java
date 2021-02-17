package MD_Hashing;

import java.util.HashMap;
import java.util.Map;

public class minindexedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minin("geeksforgeeks","set");

	}
	public static void minin(String patt,String str)
	{
		HashMap<String,Integer>hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(!hm.containsKey(str.charAt(i)))
				hm.put(str.charAt(i)+"", i);
		}
		int mini=Integer.MAX_VALUE;
		char ch='$';
		for(Map.Entry<String,Integer> ent:hm.entrySet())
		{
		       if(patt.indexOf(ent.getKey())!=-1)
		       {
		    	  if(mini>patt.indexOf(ent.getKey()))
		    	  {
		    		  mini=patt.indexOf(ent.getKey());
		    		 // System.out.println(mini);
		    		  ch=patt.charAt(mini);
		    		 // System.out.println(ch);
		    	  }
		   	   }
		}
		System.out.println(ch);
	}

}
