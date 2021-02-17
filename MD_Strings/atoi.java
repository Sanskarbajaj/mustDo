package MD_Strings;

public class atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("-12"));

	}
	static int atoi(String str)
	    {
	        for(int i=0;i<str.length();i++)
	        {  if(str.charAt(i)=='-')
	            {}
	            else if(!Character.isDigit(str.charAt(i)))
	            return -1;}
	 Integer ans=Integer.parseInt(str);
	    return ans; }
}
