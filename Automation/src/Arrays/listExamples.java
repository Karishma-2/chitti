package Arrays;

import java.util.ArrayList;

public class listExamples {

	public static void main(String[] args) {
	ArrayList info=new ArrayList();
	info.add(123);
	info.add("preethi");
	info.add(98.3);
	System.out.println(info);
	System.out.println("list using for loops");
	
	for(int i=0;i<info.size();i++)
	{
		System.out.println(info.get(i));	
	}
	Object preethi=info.get(1);
	System.out.println(preethi);
	System.out.println("using for each loop");
	for(Object var:info)
	{
		System.out.println(var);
	}
	}

}
