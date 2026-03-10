public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Array declaration + initialization combined with String.join() in single statements
        String[] bannerLines = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join(" ", "*", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "H", "E", "L", "L", "O", " ", "*"),
            String.join(" ", "*", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", "W", "O", "R", "L", "D", " ", "*"),
            String.join(" ", "*", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to display banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}