import java.util.*;

class CountOfCha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        int letter = 0, digits = 0, special = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letter++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (Character.isWhitespace(ch)) {
                spaces++;
            }
            else {
                special++;
            }
        }

        System.out.println("Letters: " + letter);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
        System.out.println("Spaces: " + spaces);
    }
}