 import java.util.HashMap;

public class UC8BannerApp {

    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<Character, String[]> patternMap = new HashMap<>();

        // Step 2: Store patterns

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Step 3: Banner word
        String word = "OOPS";

        // Step 4: Print banner using loops
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < word.length(); j++) {

                char c = word.charAt(j);

                String[] pattern = patternMap.get(c);

                System.out.print(pattern[i] + " ");
            }

            System.out.println();
        }
    }
}