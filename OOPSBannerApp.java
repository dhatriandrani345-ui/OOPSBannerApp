import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized HashMap: character → its pattern lines
    private static Map<Character, String[]> characterPatternMap = new HashMap<>();

    // Populate the map once
    static {
        characterPatternMap.put('O', new String[]{
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        });
        characterPatternMap.put('P', new String[]{
            "PPP  ",
            "P  P ",
            "PPP  ",
            "P    ",
            "P    "
        });
        characterPatternMap.put('S', new String[]{
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        });
    }

    // Retrieves pattern for a character using map lookup
    private static String[] getPattern(char c) {
        return characterPatternMap.getOrDefault(c, new String[]{
            "?????",
            "?????",
            "?????",
            "?????",
            "?????"
        });
    }

    // Renders the banner word using nested loops + StringBuilder
    public static void renderBanner(String word) {
        int rows = 5; // each character pattern has 5 rows

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = getPattern(c);
                line.append(pattern[row]).append("  "); // spacing between letters
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}