import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        boolean h = false;
        boolean w = false;
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        // Did the input validation

        do {
            System.out.print("Enter wall height (feet): ");
            if (scnr.hasNextDouble()) {
                wallHeight = scnr.nextDouble();
                if (wallHeight > 0) {
                    h = true;
                }
                else {
                    System.out.println("Invalid");
                }
            }
            else if (scnr.hasNextInt()) {
                wallHeight = scnr.nextInt();
                if (wallHeight > 0) {
                    h = true;
                }
                else {
                    System.out.println("Invalid");
                }
            }
            else {
                System.out.println("Invalid");
                scnr.nextLine();
            }
        } while (!h);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            System.out.print("Enter wall width (feet): ");
            if (scnr.hasNextDouble()) {
                wallWidth = scnr.nextDouble();
                if (wallWidth > 0) {
                    w = true;
                }
                else {
                    System.out.println("Invalid");
                }
            }
            else if (scnr.hasNextInt()) {
                wallWidth = scnr.nextInt();
                if (wallWidth > 0) {
                    w = true;
                }
                else {
                    System.out.println("Invalid");
                }
            }
            else {
                System.out.println("Invalid");
                scnr.nextLine();
            }
        } while (!w);

        // Calculate and output wall area

        wallArea = wallHeight * wallWidth;
        System.out.println("\nWall area: " + wallArea +  " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block

        double cans_needed = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cans_needed + " cans (s)\n");

    }
}
