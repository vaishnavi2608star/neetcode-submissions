class Solution {
    public int missingNumber(int[] nums) {
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     min=
        // }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;

    }
}
