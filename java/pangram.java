import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("\"" + input + "\" is a pangram.");
        } else {
            System.out.println("\"" + input + "\" is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a HashSet to store the alphabet letters
        HashSet<Character> alphabetSet = new HashSet<>();

        // Convert the input to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Iterate through the input and add alphabet letters to the HashSet
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabetSet.add(c);
            }
        }

        // Check if the HashSet contains all 26 alphabet letters
        return alphabetSet.size() == 26;
    }
}