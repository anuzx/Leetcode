class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer , Integer> var = new HashMap<>();
        for (int i =0 ; i<nums.length ; i++){

            Integer varIdx = var.get(nums[i]);
            if (varIdx != null){

                return new int[]{i , varIdx};
            } var.put(target - nums[i] , i );
        }return nums ;
        
    }
}
