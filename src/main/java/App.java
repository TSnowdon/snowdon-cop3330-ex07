import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstInput;
        String secondInput;
        int feetLength;
        int feetWidth;
        float ratio = 0.09290304f;
        System.out.print("What is the length of the room in feet? ");
        firstInput = reader.nextLine();
        System.out.print("What is the width of the room in feet? ");
        secondInput = reader.nextLine();

        try {
            feetLength = Integer.parseInt(firstInput);
            feetWidth = Integer.parseInt(secondInput);
        } catch (Exception e) {
            System.out.println("Invalid input! Please run the program again and try a different value.");
            return;
        }
        int squareFeet = feetLength * feetWidth;
        float squareMeter = squareFeet * ratio;
        System.out.println("The area is");
        System.out.println(squareFeet + " square feet");
        System.out.println(squareMeter + " square meters");
    }
}
