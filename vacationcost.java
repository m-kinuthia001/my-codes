package myjava;

/*mathias matheri kinuthia
 * J77-11325-2024
 * a program to compute total vacation cost */

 import java.util.Scanner;

public class vacationcost {
    


    // Method to calculate the total cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter accommodation cost: ");
        double accommodation = input.nextDouble();

        System.out.print("Enter meal cost: ");
        double meals = input.nextDouble();

        System.out.print("Enter activity cost: ");
        double activities = input.nextDouble();

        // Calculating total cost
        double totalCost = calculateTotalCost(accommodation, meals, activities);

        // Displaying result
        System.out.println("Total Vacation Cost: $" + totalCost);

        input.close();
    }
}


