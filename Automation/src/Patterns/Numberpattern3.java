package Patterns;

public class Numberpattern3 {
     public void displayNumberpattern3(int rows)
     {
    	 for(int i=rows;i>=1;i--)
    	 {
    		 for(int j=i;j>=1;j--)
    		 {
    			System.out.print(i+" ");        //Syso(j+" ")==> 54321 4321 321 21 1   
    		 }                                   //Syso(i+" ")==> 55555  4444 333 22 1 
    		 System.out.println();
    	 }
     }
	public static void main(String[] args) {
		Numberpattern3 np=new Numberpattern3();
		np.displayNumberpattern3(5);
	}

}
/*public static void main(String args[]){
 int rows=5;
 for(int i=rows;i>=1;i--){
 for(int j=i;j>=1;j--){
 System.out.print(j+" ");
 }sysem.out.println();
 }}*/
