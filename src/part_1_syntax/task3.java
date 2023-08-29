package part_1_syntax;

// =================================
// 3. Demonstrate String operations.
// =================================

public class task3 {

    public static void main(String[] args) {

        String string1 = "Hello ";
        String string2 = "World!";

        String string3 = string1 + string2;
        //Concatenation (combining two strings into a new string)

        System.out.println(string3);

        string3 = string3.toUpperCase();
        //All letters to UPPER CASE

        System.out.println(string3);

        string3 = string3.toLowerCase();
        //All letters to lower case

        System.out.println(string3);

    }
}