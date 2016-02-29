package translatingnumbers;

import java.util.Arrays;
import java.util.List;

/**
 * This mini-pattern can be used to translate numbers into string for example. Consider that I want to
 * translate the numbers 1, 2, 3 into one, two and three. It is possible to do this via an if statement
 * or a case statement.
 * Using a list and using the numbers as indices to the translates values makes things much easier.
 * You could use this to convert number to months for example.
 */

public class NumberTranslator {

    private static final List<String> DIGITS_TO_TEXT = Arrays.asList("one", "two", "three");

    public static String convertDigitToText(Integer index)  {
        if (index <= 0 || index > DIGITS_TO_TEXT.size()) {
            throw new IllegalArgumentException("index must be less than " + DIGITS_TO_TEXT.size());
        }
        return DIGITS_TO_TEXT.get(index - 1);
    }
}
