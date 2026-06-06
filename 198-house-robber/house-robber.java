class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return sta(nums, 0, dp);
    }

    public int sta(int[] num, int i, int[] dp) {

        if (i >= num.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int take = num[i] + sta(num, i + 2, dp);

        int nottake = sta(num, i + 1, dp);

        dp[i] = Math.max(take, nottake);

        return dp[i];
    }
}