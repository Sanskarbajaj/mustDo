package MD_Strings;

public class strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strstr("GeeksForGeeks","For"));

	}
	static int strstr(String str, String target)
	    {
	        String ss="";
	        for(int i=0;i<str.length();i++)
	        {
	            for(int j=i+1;j<str.length()-1;j++)
	            {
	                ss=str.substring(i,j);
	                if(ss.equals(target))
	                return i;
	            }
	        }
	       return -1;}

}
