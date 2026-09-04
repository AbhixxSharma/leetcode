class Solution {
    public int maxValidSplits(int[] nums) {

        int ans = 0;

        for (int remove = -1; remove < nums.length; remove++) {

            int n = nums.length - (remove == -1 ? 0 : 1);

            int[] arr = new int[n];

            int j = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i == remove) {
                    continue;
                }
                arr[j++] = nums[i];
            }

            int[] pref = new int[n];
            int[] suff = new int[n];

            pref[0] = arr[0];

            for (int i = 1; i < n; i++) {
                pref[i] = findGCD(pref[i - 1], arr[i]);
            }

            suff[n - 1] = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                suff[i] = findGCD(suff[i + 1], arr[i]);
            }

            int cnt = 0;

            for (int i = 0; i < n - 1; i++) {
                if (pref[i] == suff[i + 1]) {
                    cnt++;
                }
            }

            ans = Math.max(ans, cnt);
        }

        return ans;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}