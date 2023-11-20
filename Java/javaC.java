import java.util.*;

public class javaC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] letterPresent = new boolean[26];

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';   // Map 'a' to 0, 'b' to 1, ..., 'z' to 25
                letterPresent[index] = true;
            }
        }

        for (boolean isPresent : letterPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
