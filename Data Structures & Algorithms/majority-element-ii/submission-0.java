class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(int n:nums){
           if(map.containsKey(n)){
            map.put(n,map.get(n)+1);
           }else{
            map.put(n,1);
           }
        }
        int n=nums.length;
        for(int num:map.keySet()){
            if(map.get(num)>n/3){
                ans.add(num);
            }
        }
        return ans;
    }
}