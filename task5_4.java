package task5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class task5_4 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        try {
		            // Input: User's birthdate
		            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
		            String birthdateInput = scanner.nextLine();
		            
		            // Parse the input to LocalDate
		            LocalDate birthdate = LocalDate.parse(birthdateInput);
		            LocalDate today = LocalDate.now();

		            // Validate the birthdate
		            if (birthdate.isAfter(today)) {
		                System.out.println("Birthdate cannot be in the future!");
		                return;
		            }

		            // Calculate the age
		            Period age = Period.between(birthdate, today);

		            // Output: Age in years, months, and days
		            System.out.println("Your age is: " 
		                               + age.getYears() + " years, " 
		                               + age.getMonths() + " months, and " 
		                               + age.getDays() + " days.");

		        } catch (Exception e) {
		            System.out.println("Invalid input! Please enter the date in the format yyyy-mm-dd.");
		        } finally {
		            scanner.close();
		        }
		    }
		}

