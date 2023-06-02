package Patterns;



public class Numberpattern2 {
  public void displayNumberPattern2(int rows)
  {
	  for(int i=rows;i>=1;i--)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  // j repalce to "*"
			  System.out.print(j+" ");   //("*"+" ")     //Syso(j+" ")==> 12345 1234 123 12 1
		  }                                   //Syso(i+" ")==>  55555 4444 333 22 1
		  System.out.println();
	  }
  }
	public static void main(String[] args) {
		Numberpattern2 np=new Numberpattern2();
		np.displayNumberPattern2(5);
	}

}
/*public static void main(String args[]){
  int row=5
  for(int i=rows;i>=1;i--){
  for(int j=1;j<=i;j++){
  System.out.print(j+" ")
  System.out.print(i+" ")
  }}}
 */
