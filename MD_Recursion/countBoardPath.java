package MD_Recursion;

public class countBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cntbp(0,0,2-1,8-1));

	}
	public static int cntbp(int cr,int cc,int er,int ec){
		if(cr==er&&cc==ec)
			return 1;		
		if(cr>er||cc>ec)
			return 0;
		int hc=cntbp(cr, cc+1, er, ec);
		int vc=cntbp(cr+1, cc, er, ec);
	return hc+vc;}

}
