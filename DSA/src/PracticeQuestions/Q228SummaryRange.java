package PracticeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q228SummaryRange {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        String currentRange = "";
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j < nums.length - 1) {
                if (nums[j + 1] != (nums[j] + 1)) {
                    if (i != j) {
                        ranges.add("" + nums[i] + "-" + ">" + nums[j]);
                        i = j + 1;
                    } else {
                        ranges.add("" + nums[i]);
                        i = j + 1;
                    }

                }
            } else {
                if (i == j) {
                    ranges.add("" + nums[i]);
                } else {
                    ranges.add("" + nums[i] + "-" + ">" + nums[j]);
                }
            }

        }
        return ranges;
    }

}

