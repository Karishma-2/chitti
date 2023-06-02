package Arrays;

import java.lang.reflect.Array;

public class duplicatechar {

	public static void main(String[] args) {
		
		String str = "Technologies";
		char[] array = str.toCharArray();
		
		System.out.println("String is:" + str);
		
		//System.out.print("Duplicate characters in string: " + array[0]);
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i + 1; j < str.length(); j++) {
				
				if (array[i] == array[j]) {
					System.out.print(array[i] + " ");

				}
			}
		}
		
	}
}
