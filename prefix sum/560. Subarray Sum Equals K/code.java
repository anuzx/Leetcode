class Solution {
    public int subarraySum(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;

        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();

        // initialize with 0 sum having frequency 1
        prefixSumFreq.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            // check if there is a prefixSum that makes subarray sum = k
            if (prefixSumFreq.containsKey(prefixSum - k)) {
                count += prefixSumFreq.get(prefixSum - k);
            }

            // update current prefixSum frequency
            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
