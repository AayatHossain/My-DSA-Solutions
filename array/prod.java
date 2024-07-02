
//unoptimized approach

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
    
        for(int i = 0; i < n; i++){
            int n1 = nums[i];
    
            //the single value itself is a subarray
            max = Math.max(n1, max);
            
            for(int j = i+1 ; j < n; j++){
                //subarrays of the number n1. fa/  1 2 3 4 5
                                            //sub array of  2 =    2, 
                                                                // 2 3
                                                                // 2 3 4
                                                                // 2 3 4 5
                n1 = n1 * nums[j];
                max = Math.max(n1, max);
            }
         }
        
         return max;
    }
}