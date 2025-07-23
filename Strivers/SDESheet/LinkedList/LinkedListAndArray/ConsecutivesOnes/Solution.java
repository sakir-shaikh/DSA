class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int localCount= 0;
     int maxCount = 0;
     for(int i =0; i<nums.length; i++){
        if(nums[i] != 1){
            localCount = 0;
        }
        else{
            localCount++;
            maxCount = Math.max(localCount, maxCount);
        }
     }
     return maxCount;
    }
}