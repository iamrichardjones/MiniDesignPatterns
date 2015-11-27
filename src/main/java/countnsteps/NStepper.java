package countnsteps;


import java.util.ArrayList;
import java.util.List;

public class NStepper {

    public static List<Integer> counter(Integer step, Integer maxValue) {
        List<Integer> res = new ArrayList();

        for (int i = 0; i <= maxValue; i++) {
            if (i % step == 0) {
                res.add(i);
            }
        }

        return res;
    }
}
