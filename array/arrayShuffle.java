class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int ans[] = new int[size];
        int j = 0;
        for(int i = 0; i < n; i++){
            ans[j] = nums[i];
            ans[j+1] = nums[n+i];
            j += 2;
        }
        return ans;
    }
}