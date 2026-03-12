 import java.util.HashMap;

public class UC8BannerApp {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Store patterns

       import java.util.Scanner;

public class LeapYearCheck1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Enter a year greater than or equal to 1582");
        } 
        else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        else {
            System.out.println("Year is not a Leap Year");
        }
    }
}