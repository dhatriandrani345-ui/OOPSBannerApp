public class OOPSBannerApp {

    static String getO(int line) {
        String[] o = {
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*","*","*","*","*")
        };
        return o[line];
    }

    static String getP(int line) {
        String[] p = {
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," ","*"),
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," "," "),
            String.join("", "*"," "," "," "," "),
            String.join("", "*"," "," "," "," "),
            String.join("", "*"," "," "," "," ")
        };
        return p[line];
    }

    static String getS(int line) {
        String[] s = {
            String.join("", "*","*","*","*","*"),
            String.join("", "*"," "," "," "," "),
            String.join("", "*","*","*","*","*"),
            String.join("", " "," "," "," ","*"),
            String.join("", " "," "," "," ","*"),
            String.join("", " "," "," "," ","*"),
            String.join("", "*","*","*","*","*")
        };
        return s[line];
    }

    public static void main(String[] args) {
        // UC6: Static methods invoked directly during array declaration
        String[] bannerLines = {
            getO(0)+"  "+getO(0)+"  "+getP(0)+"  "+getS(0),
            getO(1)+"  "+getO(1)+"  "+getP(1)+"  "+getS(1),
            getO(2)+"  "+getO(2)+"  "+getP(2)+"  "+getS(2),
            getO(3)+"  "+getO(3)+"  "+getP(3)+"  "+getS(3),
            getO(4)+"  "+getO(4)+"  "+getP(4)+"  "+getS(4),
            getO(5)+"  "+getO(5)+"  "+getP(5)+"  "+getS(5),
            getO(6)+"  "+getO(6)+"  "+getP(6)+"  "+getS(6)
        };

        // Enhanced for loop to display banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}