 import java.util.HashMap;

public class UC8BannerApp {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Store patterns

    import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Checking if first number is smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}