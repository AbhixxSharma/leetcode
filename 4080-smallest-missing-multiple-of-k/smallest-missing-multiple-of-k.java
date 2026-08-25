class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);

        Set<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
            
        }
        // int x=0;
               int i = 1;
        while (true) {
            int multiple = i * k;
            if (!set.contains(multiple)) {
                return multiple;
            }
            i++;
        }


    }
}