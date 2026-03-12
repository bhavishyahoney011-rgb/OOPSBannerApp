 import java.util.HashMap;

public class UC8BannerApp {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Store patterns

    import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}