package part_1_syntax;
import java.util.Scanner;

// =======================================
// 4. Demonstrate Input/Output operations.
// =======================================

public class task4 {
    public static void main(String[] args) {

        System.out.println("Printing a line of text");
        System.out.print("Printing without a new line character");
        System.out.println("\t tab");
        System.out.println("a new \nline");

        Scanner keyboard = new Scanner(System.in); // Created a scanner variable named "keyboard"
        String name;
        System.out.println("Who are you?");
        name = keyboard.nextLine();

        byte birthday;
        System.out.println("What day of the month you were born? (1-31)");
        birthday = keyboard.nextByte();

        String surname;
        System.out.println("What is your surname?");
        keyboard.nextLine(); //This statement is here so that Java "consumes" the newline character and moves to reading a new line.
        surname = keyboard.nextLine();

        System.out.println("Hello " + name + ' ' + surname + '!');
        System.out.println("You were born on " + birthday + "th of some month.");
    }
}