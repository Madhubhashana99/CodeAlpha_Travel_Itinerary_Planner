import java.util.Scanner;

public class TravelItaneraryPlanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Travel Itanerary Planner");

        //Getting the user inputs
        System.out.println("Enter your destination: ");
        String destination = scanner.nextLine();

        System.out.println("Enter the start date (YYYY-MM-DD): ");
        String sd = scanner.nextLine();

        System.out.println("Enter the end date (YYYY-MM-DD): ");
        String ed = scanner.nextLine();

        System.out.println("Enter your budget for the trip: ");
        Double budget = scanner.nextDouble();

    }
}
