class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0 , r=0;
        int zeroCount =0;
        int ans =0;
        while(r<nums.length){
            if(nums[r]==0) zeroCount ++ ;
            while(zeroCount >k){
                if(nums[l]==0) zeroCount --;
                l++;
            }
            ans = Math.max(ans , r-l+1);
            r++;
        }
        return ans ;
    }
}
