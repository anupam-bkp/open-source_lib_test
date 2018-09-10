package guava.string.utilities.test;

import com.google.common.base.Strings;

public class EmptyAndNullTest {

	public static void main(String[] args) {
		
		String helloStr = "Hello";
		String nullStr = null;
		String emptyStr = "";
		
		System.out.println(Strings.isNullOrEmpty(helloStr));
		System.out.println(Strings.isNullOrEmpty(nullStr));
		System.out.println(Strings.isNullOrEmpty(emptyStr));
		
		System.out.println("====================================");
		
		System.out.println(Strings.nullToEmpty(helloStr));
		System.out.println(Strings.nullToEmpty(nullStr));
		System.out.println(Strings.nullToEmpty(emptyStr));
		
		System.out.println("====================================");
		
		System.out.println(Strings.emptyToNull(helloStr));
		System.out.println(Strings.emptyToNull(nullStr));
		System.out.println(Strings.emptyToNull(emptyStr));
		
		System.out.println("====================================");
		
	}
	
}
