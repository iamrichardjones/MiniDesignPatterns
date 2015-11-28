package countnsteps;


import java.util.ArrayList;
import java.util.List;

/**
 * This mini-pattern can be used to give a sequence of numbers with a specific interval/step.
 * It takes a sequence off numbers and uses the modulus operator to check if the remainder values
 * equals zero. If it does then it adds it to a new list. This list is the return parameter
 * of the method
 */
public class NStepper {

    public static List<Integer> getIntervals(Integer step, Integer maxValue) {
        if (step < 1) {
            throw new IllegalArgumentException(String.format("Negative step entered: %s", step));
        }
        if (maxValue < 1) {
            throw new IllegalArgumentException(String.format("Negative maxValue entered: %s", maxValue));
        }

        List<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i <= maxValue; i++) {
            if (i % step == 0) {
                res.add(i);
            }
        }

        return res;
    }
}
