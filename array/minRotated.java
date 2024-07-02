class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            // 3 4 5 1 2. here, when we reach 1 < 5, means we found our pivot 5, and the element next to it is always the smallest, so we printed 1.
            if(nums[i] < nums[i -1]){
                return nums[i];
            }
        }
        //if no pivot is found it means the array is already sorted. in that case the first element is the minimum value.
        return nums[0];
    }
}