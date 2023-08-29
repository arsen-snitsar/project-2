package part_2_dialog;
import java.util.Scanner;

// ===============================================================================
// Build conversation with user using I/O operations. Make a user-friendly dialog.
// ===============================================================================

public class dialog {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Created a scanner variable named "keyboard"
        //1
        System.out.println("Hi, what's your name?");
        String name;
        name = keyboard.nextLine();
        //2
        System.out.println("Thanks, and your surname?");
        String surname;
        surname = keyboard.nextLine();
        //3
        System.out.println("What year have you been born in?");
        short year;
        year = keyboard.nextShort();
        //4
        System.out.println("What city do you live in?");
        String city;
        city = keyboard.nextLine();
        //5
        System.out.println("What is your favorite subject");
        String subject;
        subject = keyboard.nextLine();

        System.out.println("So you are " + name + " " + surname + ", born in " + age + " and live in a wonderful city of " + city + ". And it seems you enjoy" + subject + " too!");

    }
}
