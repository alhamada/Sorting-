import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> employeeIDs = new HashMap<>();
        employeeIDs.put("a1234","Steve Jobs");
        employeeIDs.put("a1235","Bill Gates");
        employeeIDs.put("a1236","Jeff Bezos");
        employeeIDs.put("a1237","Hasan");

        for(Map.Entry m:employeeIDs.entrySet()) {
            System.out.println(m);

        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the Number of employee: ");
        String userInput= scanner.nextLine();
        String lowerinput= userInput.toLowerCase();

        System.out.println(employeeIDs.get(lowerinput));



    }
}