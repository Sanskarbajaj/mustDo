package MD_Recursion;

public class printmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printmazewd(0,0,2,2,"");
		System.out.println();
		System.out.println(ansc);

	}
	  public static int ansc=0;
	    public static void printmazewd(int cr,int cc,int er,int ec,String res)
	    {
	        if(cr==er&&cc==ec)
	        {
	            System.out.print(res+" ");
	            ansc++;
	            return ;
	        }
	        if(cr>er||cc>ec)
	        {
	            return;
	        }
	     printmazewd(cr,cc+1,er,ec,res+"H");
	     printmazewd(cr+1,cc,er,ec,res+"V");
	     printmazewd(cr+1,cc+1,er,ec,res+"D");
	 }

}
