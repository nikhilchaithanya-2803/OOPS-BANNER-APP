public class UC6 {

    // Helper method to build letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method to build letter P
    public static String[] buildP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Helper method to build letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        // Call helper methods
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Loop-based rendering system
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}