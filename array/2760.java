https://leetcode.com/problems/longest-even-odd-subarray-with-threshold/description/


class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] <= threshold){
                if(nums[i] % 2 == 0){
                    int left = i;
                    int count = 1;
                     max = Math.max(max, count);
                    for(int j = left; j < n-1; j++){
                        if(nums[j] % 2 != nums[j + 1] % 2 && nums[j] <= threshold && nums[j+1] <= threshold){
                            count++;
                             max = Math.max(max, count);
                           
                        }else{
                            
                            break;
                        }
                    }
                    
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}