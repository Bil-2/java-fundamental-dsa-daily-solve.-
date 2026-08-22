import java.util.ArrayList;
import java.util.List;

public class task69 {

    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();
            createSubset(nums, 0, res, subset);
            return res;
        }

        private void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
            if (index == nums.length) {
                res.add(new ArrayList<>(subset));
                return;
            }

            // Include current number
            subset.add(nums[index]);
            createSubset(nums, index + 1, res, subset);

            // Exclude current number
            subset.remove(subset.size() - 1);
            createSubset(nums, index + 1, res, subset);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {0, 1};

        System.out.println("Subsets of [1,2,3]: " + sol.subsets(nums1));
        System.out.println("Subsets of [0,1]: " + sol.subsets(nums2));
    }
}
