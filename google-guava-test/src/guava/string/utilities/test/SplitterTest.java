package guava.string.utilities.test;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Splitter;

public class SplitterTest {

	public static void main(String[] args) {
		
		String str = "Hello,I,am,anupam,kumar, ";
		String[] split = str.split(",");
		System.out.println(Arrays.toString(split));
//		System.out.println(Arrays.asList(split));
		
		List<String> splitToList = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(str);
		System.out.println(splitToList);
		
	}
	
}
