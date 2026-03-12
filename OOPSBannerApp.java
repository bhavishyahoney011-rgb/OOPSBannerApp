 import java.util.HashMap;

public class UC8BannerApp {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Store patterns

    import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert to square inches
        double areaIn = areaCm / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}