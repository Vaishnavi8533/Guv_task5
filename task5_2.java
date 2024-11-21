package task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class task5_2 {

	
	public class NonEmptyStrings {
	    public static void main(String[] args) {
	        // Given list of strings
	        List<String> strings = Arrays.asList("abc", "be", "efg", "abed", "", "jkl");

	        // Filter non-empty strings
	        List<String> nonEmptyStrings = strings.stream()
	                                              .filter(str -> !str.isEmpty())
	                                              .collect(Collectors.toList());

	        // Print the list of non-empty strings
	        System.out.println("Non-empty strings: " + nonEmptyStrings);
	    }
	}

}
