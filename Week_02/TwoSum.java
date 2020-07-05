class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> cache = new HashMap<>();
        for (int i = 0; i< nums.length ; i++){
            Integer u =  target - nums[i];
            if (cache.containsKey(u)){
                result[0] = cache.get(u);
                result[1] = i;
                break;
            }else {
                cache.put(nums[i],i);
            }
        }
        return result;
    }
}