package edu.cscc;
import java.lang.Math;
import java.util.Scanner;

// Michael Heironimus 1.18.20 the purpose of this program is to find the volume of a cylinder given the radius and the height

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double radius, height;
        // removed volume as it was unnecessary, its equation was done in the output.

        // Input
        while (true) {
            System.out.println("Please enter the radius of the cylinder(in inches): ");
            //decided to add the unit of measurement for the radius decided inches for measurement because America
            radius = input.nextDouble();
            while (radius <= 0) {
                //this ensures that if a negative number or a negative number is not entered and zero because if that were the case it wouldn't be a cylinder
                System.out.println("Please enter the radius of the cylinder(in inches and greater than zero): ");
                radius = input.nextDouble();
            }
            System.out.println("Please enter the height of the cylinder(in inches (if you typed the wrong radius please type '-9' to start the program over)): ");
            //this gives the user an opportunity to restart the program if a mistake was made
            height = input.nextDouble();
            while (height <= 0 && height != -9) {
                //this tells the program that unless the user requested to restart it will not accept negative numbers or 0
                System.out.println("Please enter the height of the cylinder(in inches and greater than zero (if you typed the wrong radius please type '-9' to start the program over)): ");
                height = input.nextDouble();
                if (height == -9) {
                    break;
                    //this drops it out of this level of while looping if a negative nine is entered
                }
            }
            if (height != -9) {
                System.out.println("The volume of a cylinder with a radius of " + radius + " inches and a height of " + height + " inches is " + Math.PI * (radius * radius) * height + " inches³");
                //the equation for volume is inside the output
                break;
                //this breaks the program out of the while loop used to check if the user made a mistake
            }
            System.out.println("A mistake was made and program restarted");
            //this will only print if the user types '-9' and tells the program they made a mistake
        }
    }
}