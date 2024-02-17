package java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_Stream_Sorted_Method {

	public static void main(String[] args) {
		
		/*sorted*/
		List<Integer> num = Arrays.asList(1,10,2,9,3,8,4,8,5,6);
		List<Integer> sortedNum = num.stream().sorted().collect(Collectors.toList()); /*ascending order*/
		System.out.println(sortedNum);
		
		List<Integer> reverseNum = num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); /*descending order*/
		System.out.println(reverseNum);
		
		/*sorted() String*/
		List<String> names = Arrays.asList("sokoeurn","Ksatra","Davy");
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		
		List<String> reversedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversedNames);
		
		/*Eample using: anyMatch(), allMatch(), noneMatch()*/
		Set<String>fruits = new HashSet<String>();
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More graps");
		fruits.add("Two guavas");
		
		/*anyMatch() will return boolean value if one of the value match with startsWith()*/
		boolean fruitsMatch = fruits.stream().anyMatch(value->{
			return value.startsWith("One");
		});
		System.out.println(fruitsMatch);
		
		/*allMatch() all values should match to become true*/
		boolean allMatchFruits = fruits.stream().allMatch(value->{
			return value.startsWith("One");
		});
		System.out.println(allMatchFruits);
		
		/*nonMatch() means non of elements should startsWith("One"), then it becomes true otherwise it is false*/
		boolean noneMatchFruits = fruits.stream().noneMatch(value->{
			return value.startsWith("One");
		});
		System.out.println(noneMatchFruits);
		
		/*findAny() will return any elements from HashSet<String> or data source*/
		Optional<String> findAnyFruits = fruits.stream().findAny();
		System.out.println(findAnyFruits.get());
		
		/*findFirst() will return the first element from HashSet<String>*/
		Optional<String> findFirstFruits = fruits.stream().findFirst();
		System.out.println(findFirstFruits.get());
		
		/*concat(stream) method*/
		List<String> animals = Arrays.asList("Dog","Cat","Pick","Duck");
		
		Stream<String>animalsStream = animals.stream();
		Stream<String> fruitsStream = fruits.stream();
		
		List<String> concatStream = Stream.concat(animalsStream, fruitsStream).collect(Collectors.toList());
		for(String eachStreamElement:concatStream) {
			System.out.println(eachStreamElement);
		}
		
		
		
	}

}
