package Parse.String.ToInt;

import java.math.BigInteger;

/**
 * <p>Class have one method that converts a number from a string to integer number
 *
 * @author Vyacheslav Balyk
 * @version 1.0
 */
public class NumberFormatter {

    /**
     * <p>Method converts a number from a string to integer number
     *
     * @param input String that have a number
     * @return BigInteger. Return integer number from string
     */
    public BigInteger parseInt(String input) {
        return new BigInteger(input);
    }
}
