class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        subsets(result, temp, nums, 0);

        return result;
    }

    private void subsets(
            List<List<Integer>> result,
            List<Integer> temp,
            int[] nums,
            int index) {

        if (index == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Exclude current element
        subsets(result, temp, nums, index + 1);

        // Include current element
        temp.add(nums[index]);
        subsets(result, temp, nums, index + 1);

        // Backtrack
        temp.remove(temp.size() - 1);
    }
}