public class task66 {

    static class Solution {
        public int candy(int[] ratings) {
            int n = ratings.length;
            if (n == 0) return 0;

            int totalCandies = n; // at least 1 candy per child
            int i = 1;

            while (i < n) {
                if (ratings[i] == ratings[i - 1]) {
                    i++;
                    continue;
                }

                int currentPeak = 0;
                while (i < n && ratings[i] > ratings[i - 1]) {
                    currentPeak++;
                    totalCandies += currentPeak;
                    i++;
                }

                if (i == n) break;

                int currentValley = 0;
                while (i < n && ratings[i] < ratings[i - 1]) {
                    currentValley++;
                    totalCandies += currentValley;
                    i++;
                }

                totalCandies -= Math.min(currentPeak, currentValley);
            }

            return totalCandies;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] ratings1 = {1, 0, 2};
        int[] ratings2 = {1, 2, 2};
        int[] ratings3 = {1, 3, 4, 5, 2};

        System.out.println("Total candies (ratings1): " + sol.candy(ratings1)); // 5
        System.out.println("Total candies (ratings2): " + sol.candy(ratings2)); // 4
        System.out.println("Total candies (ratings3): " + sol.candy(ratings3)); // 11
    }
}
