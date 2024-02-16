package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class All_Stream_Methods_In_Java_Stream {

	public static void main(String[] args) {
		/*
		 * Two types of methods in Java Stream
		 * 
		 * 1, NOn-Terminal Methods: will return stream() data: filter() map() flatMap() distinct() limit() ...
		 * 2, Terminal methods: for processing data after stream(): collect() count() min() max() forEach() toArray()
		 * 
		 * */
		
		List<String> transport = Arrays.asList("car","bus","car","bike","motor","bike","car");
		List<String> newTransport = transport.stream().distinct().collect(Collectors.toList());
		System.out.println(newTransport);
		
		/*another way*/
		transport.stream().distinct().forEach(value->System.out.println(value));
		
		/*count*/
		long count = transport.stream().distinct().count();
		System.out.println(count);

	}

}
