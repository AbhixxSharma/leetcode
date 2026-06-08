class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lst=new ArrayList<>();
        List<Integer> lst2=new ArrayList<>();
        List<Integer> lst3=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                lst.add(nums[i]);
            }
            else if(nums[i]==pivot){
                lst2.add(nums[i]);

            }
            else if(nums[i]>pivot){
                lst3.add(nums[i]);

            }
        }
        int z= lst.size() +lst2.size() +lst3.size();
        int arr2[]=new int[z];
        int i=0;
        for( int a=0;a<lst.size();a++){
            arr2[i++]=lst.get(a);
        }
        int j=i;
        for(int k=0;k<lst2.size();k++){
            arr2[j++]=lst2.get(k);
        }
        int k=j;
        for(int l=0;l<lst3.size();l++){
            arr2[k++]=lst3.get(l);
        }
        return arr2;
        
    }
}