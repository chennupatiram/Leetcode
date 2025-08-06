class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0;i < n;i++){
            int compliment = target - nums[i];
            if(res.containsKey(compliment)){
                return new int[]{res.get(compliment),i};
            }
            res.put(nums[i],i);
        }
        return new int[]{};
    }
}