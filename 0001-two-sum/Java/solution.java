class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> two = new HashMap<>();
        
        int index = 0;
        for(int n : nums){
            two.put(n,index);
            index++;
        } 

        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(two.containsKey(diff) && two.get(diff) != i){
                return new int[]{i,two.get(diff)};
            }
        }

        return new int[]{};
        
    }
}