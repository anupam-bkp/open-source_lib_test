package guava.collection.utilities.test;

import java.util.List;

import com.google.common.collect.Lists;

public class StaticConstructorsTest {

	public static void main(String[] args) {
		List<String> strList = Lists.newArrayList("Hello", "Hi", "Everyone");
		strList.forEach(System.out :: println);
	}
	
}
