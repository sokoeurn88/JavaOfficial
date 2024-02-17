package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
		
		/*limit()*/
		List<String> limstransport = transport.stream().limit(2).collect(Collectors.toList());
		System.out.println(limstransport);
		transport.stream().limit(3).forEach(System.out::println);
		
		/*New Example*/
		List<Integer>num= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
				
		/*min() is non-terminal method*/
		Optional<Integer> minNum = num.stream().min((value1,value2)->{return value1.compareTo(value2);});
		System.out.println(minNum.get());
		
		/*max()*/
		Optional<Integer> maxNum = num.stream().max((value1,value2)->{
			return value1.compareTo(value2);
		});
		System.out.println(maxNum.get());
		
		/*reduce()*/
		Optional<Integer> reduceNum = num.stream().reduce((value,combinedvalue)->{
			return combinedvalue+value;
		});
		System.out.println(reduceNum.get());
		
		
		/*toArray()*/
		Object[] numArray = num.stream().toArray();
		for(Object n:numArray) {
			System.out.println(n);
		}
		
		
		

	}

}
