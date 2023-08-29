package part_1_syntax;

// =======================================
// 2. Demonstrate operations with Numbers.
// =======================================

public class task2 {
    public static void main(String[] args)
    {
        int money_left = 1000;
        float product_price = 9.99f;
        System.out.print("Money left after buying the product: ");
        System.out.println((float)money_left - product_price);

        System.out.print("Addition: 2 + 2 = ");
        System.out.println(2 + 2);

        System.out.print("Substraction: 13 - 4 = ");
        System.out.println(13-4);

        System.out.print("Multiplication: 12 * 12 = ");
        System.out.println(12 * 12);

        System.out.print("Division: 169 / 13 = ");
        System.out.println(169 / 13);
    }
}
