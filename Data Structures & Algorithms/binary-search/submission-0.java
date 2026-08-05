class Solution {
    public int search(int[] nums, int target) {
      
        return bs(nums,target,0,nums.length-1);
    }
    public int bs(int[]nums,int target,int st,int end){
       
       
        while(st<=end){
             int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }
}
