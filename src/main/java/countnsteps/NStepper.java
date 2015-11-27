package countnsteps;


import java.util.ArrayList;
import java.util.List;

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
