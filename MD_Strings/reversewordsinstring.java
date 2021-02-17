package MD_Strings;

public class reversewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(revp("pqr.mno"));

	}
	public static String revp(String str)
	{
		String ans="";
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.')
			{
				
				ans=temp+"."+ans;
				temp="";
			}
			else
			{
				temp=temp+str.charAt(i);
				
			}
		}
		ans=temp+"."+ans;
		StringBuilder sb=new StringBuilder(ans);
		sb.deleteCharAt(sb.length()-1);
	return sb.toString();}

}
