public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int lo = 0;
            int hi = grid[0].length - 1;
            int ans = 0;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (grid[i][mid] < 0) {
                    ans = grid[0].length - mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }

            }
            count += ans;

        }
        return count;
    }
}
