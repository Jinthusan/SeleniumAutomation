package Section15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long c = Stream.of("Jinthu","Abi","Alakan","Karan", "Anbu").filter(s-> {
			
			return s.startsWith("J");
			
		}).count();
		System.out.println(c);
		
		//Print all the name in the list
		//Stream.of("Jinthu","Abi","Alakan","Karan", "Anbu").forEach(s->System.out.println(s));
		
		//Print the names in the list which has length greater than 4
		Stream.of("Jinthu","Abi","Alakan","Karan", "Anbu").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//Map
		//Print names in the array which start with A and convert to uppercase and sort it
		List<String> humanNames = Arrays.asList("Jinthu","Abi","Alakan","Karan", "Anbu");
		humanNames.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Concactinate two list and check "jinthu" present in the new concatinated list
		ArrayList<String> animalName = new ArrayList<String>();
		animalName.add("Dog");
		animalName.add("Cat");
		animalName.add("Elephant");
		animalName.add("Kangaroo");
		animalName.add("Giraffee");
		System.out.println(animalName);
		
		Stream<String> newStream=Stream.concat(humanNames.stream(), animalName.stream());
		Boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Jinthu"));
		Assert.assertTrue(flag);
		
		//Collect output into new list - use collectors
		
		List<String> names = Arrays.asList("Jinthu","Abi","Alakan","Karan", "Anbu");
		List<String> outputList =names.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(outputList.get(1));
		
		//Remove duplicate in a list and print only the unique values
		
		System.out.println(Stream.of("Jinthu","Abi","Alakan","Karan", "Anbu", "Jinthu").distinct().collect(Collectors.toList()));
		
		
		
		

	}

}
