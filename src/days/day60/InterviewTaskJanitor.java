package days.day60;

import java.util.Collections;
import java.util.List;

public class InterviewTaskJanitor {


    public static int efficientJanitor(List<Float> weights) {


//        3/2 = 1.5
        if (Collections.min(weights) > 1.5) {
            return weights.size();
        } else if (weights.size() == 1) {  // just for approach!!!
            return 1;
        }  // <1.5 !!! TODO


        Collections.sort(weights);
        int left = 0;
        int right = weights.size() - 1;
        int trip = 0;

        while (left <= right) {
            if (weights.get(left) + weights.get(right) <= 3) {
                left++;
            }
            right--;
            trip++;
        }
        return trip;
    }
}
