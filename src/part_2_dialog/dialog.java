package part_2_dialog;
import java.util.Scanner;

// ===============================================================================
// Build conversation with user using I/O operations. Make a user-friendly dialog.
// ===============================================================================

public class dialog {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Created a scanner variable named "keyboard"
        System.out.println("Hi, what's your name?");
        String name;
        name = keyboard.nextLine();
        System.out.println("Nice to meet you, " + name);

        System.out.println("How old are you?");
        byte age;
        age = keyboard.nextByte();
        if (age > 100)
        {
            System.out.println("That's a lot!");
        }

        System.out.println("What city do you live in?");
        String city;
        city = keyboard.nextLine();
        System.out.println(city + " is a great city!");


    }
}
