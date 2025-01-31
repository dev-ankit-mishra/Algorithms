import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.getLast()[1] < interval[0]) {
                ans.add(interval);
            } else {
                int[] newInterval = new int[2];
                newInterval[0] = ans.getLast()[0];
                newInterval[1] = Math.max(ans.getLast()[1], interval[1]);
                ans.set(ans.size() - 1, newInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
