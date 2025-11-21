package myjava;
/*mathias matheri kinuthia
 * J77-11325-2024
 * a program to compute fitness level by number of steps
 */

import java.util.Scanner;

public class fitnesslevel {


    // Method to determine fitness level
    public static String getFitnessLevel(int steps) {

        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for steps
        System.out.print("Enter your steps for today: ");
        int steps = input.nextInt();

        // Getting fitness level
        String level = getFitnessLevel(steps);

        // Displaying result
        System.out.println("Your fitness level: " + level);

        input.close();
    }
}
   

