package guava.string.utilities.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.base.Joiner;
import com.google.common.base.Joiner.MapJoiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class JoinerTest {

	public static void main(String[] args) throws IOException{
		
		//Returning String
//		List<String> strList = Lists.newArrayList("Hello", "I", "am", "anupam", "kumar");
		List<Character> strList = Lists.newArrayList('H', 'I', 'a', 'a', 'k');
		String join = Joiner.on("").join(strList);
		System.out.println(join);
		
		//Using StringBuilder
		StringBuilder sb = new StringBuilder();
		String sbJoin = Joiner.on(",").appendTo(sb, strList).toString();
		System.out.println(sbJoin);
		
		//Using appendable
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		Joiner.on("|").appendTo(br, strList);
		br.flush();
		
		strList.add(null);
		System.out.println(strList);
		
/*
		//Will throw NullPointer Exception
		String joinWithNulls = Joiner.on("=").join(strList);
		System.out.println(joinWithNulls);		
*/		
		
		//Skip Null Value
		String joinSkipNulls = Joiner.on("=").skipNulls().join(strList);
		System.out.println(joinSkipNulls);
		
		//Default value for Null
		String joinDefaultNulls = Joiner.on("=").useForNull("oops").join(strList);
		System.out.println(joinDefaultNulls);
		
	/*	String collect = strList.stream().collect(new Supplier<StringBuilder>() {
			@Override
			public StringBuilder get() {
				return new StringBuilder();
			}
		},
		new BiConsumer<StringBuilder, Character>() {

			@Override
			public void accept(StringBuilder t, Character u) {
				t.append(u);
			}
		}, new BiConsumer<StringBuilder, StringBuilder>() {

			@Override
			public void accept(StringBuilder t, StringBuilder u) {
				//TODO
			}
		}).toString();
		
		
		System.out.println("Hello : " + collect);*/
		
		//MapJoiner
		Map<Integer, String> empMap = Maps.newHashMap();
		empMap.put(1, "John");
		empMap.put(2, "Roy");
		
		MapJoiner mapJoiner = Joiner.on("$$").withKeyValueSeparator("->");
		String mapJoin = mapJoiner.join(empMap);
		System.out.println(mapJoin);
		
	}
	
}
