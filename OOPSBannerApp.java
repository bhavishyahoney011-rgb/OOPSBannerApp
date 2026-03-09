 import java.util.*;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPatternMap> patterns = new ArrayList<>();

        patterns.add(new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        }));

        patterns.add(new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        }));

        patterns.add(new CharacterPatternMap('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        }));

        String word = "OOPS";

        printBanner(word, patterns);
    }

    public static void printBanner(String word, List<CharacterPatternMap> patterns) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                for (CharacterPatternMap cp : patterns) {

                    if (cp.getCharacter() == c) {
                        line.append(cp.getPattern()[i]).append("  ");
                    }

                }
            }

            System.out.println(line);
        }
    }
}