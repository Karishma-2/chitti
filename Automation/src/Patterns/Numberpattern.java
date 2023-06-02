package Patterns;

public class Numberpattern {
     public void displayNumberpattern(int rows, int cols)
     {
    	 for(int i=1;i<=rows;i++)
    	 {
    		 for(int j=1;j<=cols;j++)
    		 {
    			 System.out.print(j+" ");      // syso(i+" "); o/p is 111 222 333
    		 }
    		 System.out.println();
    	 }
     }
	public static void main(String[] args) {
		Numberpattern np=new Numberpattern();
		np.displayNumberpattern(3, 3);
	

	}

}
      /*   public static void main (String args[])
            {
	           int  rows=3;
          int cols=3;
          for(int i=1;i<=rows;i++){
          for(int j=1;j<=cols;j++){
          System.out.print(j+" ");
          System.out.println();
              }} }*/