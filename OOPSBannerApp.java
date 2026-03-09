 public class BannerApp {

    // Method to create letter O
    public static String[] getO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method to create letter P
    public static String[] getP() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Method to create letter S
    public static String[] getS() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + P[i] + "  " + S[i] + "  " + S[i]);
        }
    }
}