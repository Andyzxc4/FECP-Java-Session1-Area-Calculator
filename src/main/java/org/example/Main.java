package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  declare scanner object
        Scanner scannerObj = new Scanner(System.in);

        // main ui printing
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle\n2. Triangle\n3. Rectangle");

        System.out.print("Choose a shape (1-3): ");
        int userInput = scannerObj.nextInt();

        switch (userInput) {
            case 1:
                System.out.print("Enter the radius: ");
                double radiusInput = scannerObj.nextDouble();

                System.out.printf("Area of the circle: %,.2f", calculateCircleArea(radiusInput));
                break;
            case 2:
                System.out.print("Enter the base: ");
                double baseInput = scannerObj.nextDouble();

                System.out.print("Enter the height: ");
                double heightInput = scannerObj.nextDouble();

                System.out.printf("Area of the triangle: %,.2f", calculateTriangleArea(baseInput, heightInput));
                break;
            case 3:
                System.out.print("Enter the length: ");
                double lengthInput = scannerObj.nextDouble();

                System.out.print("Enter the width: ");
                double widthInput = scannerObj.nextDouble();

                System.out.printf("Area of the rectangle: %,.2f", calculateRectangleArea(lengthInput, widthInput));
                break;
            default:
                System.out.println("Invalid inputs.");
        }

        //  close scanner object
        scannerObj.close();

    }

    public static double calculateCircleArea(double radius) {
        return 3.14159*radius*radius;
    }
    public static double calculateTriangleArea(double base, double height) {
        return (double) 1 /2 * base * height;
    }
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}