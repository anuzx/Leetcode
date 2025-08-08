class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer , Integer> var = new HashMap<>();
        for (int i =0 ; i<nums.length ; i++){

           int comp = target - nums[i];

if(var.containsKey(comp)){

return new int []{i , var.get(comp)};}
else {

var.put(nums[i] , i);} }

return null; } } 

