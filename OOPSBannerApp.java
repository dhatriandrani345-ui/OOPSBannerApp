public class OOPSBannerApp {

    // Static inner class - CharacterPatternMap (as specified in UC7)
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized pattern objects using CharacterPatternMap
        CharacterPatternMap patternO = new CharacterPatternMap('O', new String[]{
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*","*","*","*","*")
        });

        CharacterPatternMap patternP = new CharacterPatternMap('P', new String[]{
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," "," "),
            String.join("", "*"," "," "," "," "),
            String.join("", "*"," "," "," "," "),
            String.join("", "*"," "," "," "," ")
        });

        CharacterPatternMap patternS = new CharacterPatternMap('S', new String[]{
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," "," "),
            String.join("", "*","*","*","*","*"),
            String.join("", " "," "," "," ","*"),
            String.join("", " "," "," "," ","*"),
            String.join("", " "," "," "," ","*"),
            String.join("", "*","*","*","*","*")
        });

        // OOPS = O, O, P, S - reusing patternO (DRY principle)
        CharacterPatternMap[] word = {patternO, patternO, patternP, patternS};

        // StringBuilder to build each row efficiently
        for (int line = 0; line < 7; line++) {
            StringBuilder row = new StringBuilder();
            for (int i = 0; i < word.length; i++) {
                row.append(word[i].getPattern()[line]);
                if (i < word.length - 1) {
                    row.append("  ");
                }
            }
            System.out.println(row.toString());
        }
    }
}