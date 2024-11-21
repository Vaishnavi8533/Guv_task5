package task5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class task5_3 {

	public static void main(String[] args) {
		
		
		        // List of student names
		        List<String> students = new ArrayList<>();
		        students.add("Alice");
		        students.add("Bob");
		        students.add("Alex");
		        students.add("Catherine");
		        students.add("Andrew");
		        students.add("Brian");
		        students.add("Anna");
		        students.add("David");
		        students.add("Aaron");
		        students.add("Eve");

		        // Filter students whose names start with "A"
		        List<String> specialGiftStudents = students.stream()
		                                                   .filter(name -> name.startsWith("A"))
		                                                   .collect(Collectors.toList());

		        // Print the list of students eligible for special gifts
		        System.out.println("Students eligible for special gifts: " + specialGiftStudents);
		    }
		}


