class Solution {

    // Approach - 1
    private void permutations(List<Integer> ds, List<List<Integer>> ans,
                              int[] nums, boolean[] isVisited) {

        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!isVisited[i]) {

                ds.add(nums[i]);
                isVisited[i] = true;

                permutations(ds, ans, nums, isVisited);

                isVisited[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    // Approach - 2
    private void permutation(int idx, List<List<Integer>> ans, int[] nums) {

        if (idx == nums.length) {

            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            ans.add(list);
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            swap(idx, i, nums);

            permutation(idx + 1, ans, nums);

            swap(idx, i, nums);
        }
    }

    private void swap(int i, int j, int[] arr) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        boolean[] isVisited = new boolean[nums.length];

        // Approach - 1
        // permutations(new ArrayList<>(), ans, nums, isVisited);

        // Approach - 2
        permutation(0, ans, nums);

        return ans;
    }
}