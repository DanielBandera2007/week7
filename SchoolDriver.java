import java.util.ArrayList;
import java.util.Scanner;
public class SchoolDriver {
    public static void main(String[] args) {
        ArrayList<School> schools = new ArrayList<>();
// Add some example schools
        schools.add(new School("New River Community College", "Dublin"));
        schools.add(new School("Virginia Tech", "Blacksburg"));
        schools.add(new School("Radford University", "Radford"));
        schools.add(new School("Liberty University", "Lynchburg"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the school to search for: ");
        String searchName = scanner.nextLine();
        boolean found = false;
// Simple for loop to search
        for (School school : schools) {
            if (school.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + school);
                found = true;
                break;
            }
        }//ends for loop search
        if (!found) {
            System.out.println("Sorry, no school found with that name.");
        }
        scanner.close();
    }//ends our main method/driver
}//ends our schooldriver class