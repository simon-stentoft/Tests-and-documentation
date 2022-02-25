public class Opgaver21_02 {

    public static void main(String[] args) {
        f(4);
    }

    //Opgave 1
    public static int f(int tal) {
        if (tal < 7)
            return 1;
        else if (tal < 9)
            return 2;
        else if (tal < 13)
            return 3;
        else
            return 4;
    }

    //Opgave 1.1
    public static boolean udskriv(int nr, String besked) {
        if (nr < 100) {
            if (besked == "ja")
                return true;
        }
        if (nr > 100) {
            if (besked == "ja")
                return true;
        }
        if (nr < 100) {
            if (besked == "nej")
                return false;
        }
        if (nr > 100) {
            if (besked == "nej")
                return false;
        }
        if (nr == 100) {
            return true;
        }
        return false;
    }
}
