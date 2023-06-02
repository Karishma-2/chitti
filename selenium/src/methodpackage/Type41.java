package methodpackage;
//with returntype with parameters
public class Type41 {
	String Type41(String s1,String s2) {
	String s=s1+s2;
	System.out.println("String:"+(s1+s2));
	return s;
	}
	public static void main(String[] args) {
		Type41 obj=new Type41();
		String s=obj.Type41("37","39");
		
		System.out.println("String:"+s);
			}

}
