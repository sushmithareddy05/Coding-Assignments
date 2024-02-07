import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Roman numeral for 1994
        int integerEquivalent = romanToInteger(romanNumeral);

        System.out.println("The integer equivalent of " + romanNumeral + " is " + integerEquivalent);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentRoman = s.charAt(i);
            int currentVal = romanNumerals.get(currentRoman);

            if (currentVal < prevValue) {
                result -= currentVal;
            } else {
                result += currentVal;
            }

            prevValue = currentVal;
        }

        return result;
    }
}