class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;
        //the breakpoint is the point where the value suddenly drops, we need to increase the value at the breakpoint to get the next permuation, 
        //and  sort the rest of the part of the array in ascending order
        //to get the next permutation
        for(int i = n-2; i >= 0; i--){
            if(nums[i]<nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        //if no breakpoint was found, it means the it was the last permutation, so we make it in ascending order
        if(breakPoint==-1){
            int i = 0;
            int j = n-1;
            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }

        //we search for the iimmediate larger value than the value at bp and swap it
        for(int i = n-1; i > breakPoint; i--){
            if(nums[i] > nums[breakPoint]){
                int temp = nums[i];
                nums[i] = nums[breakPoint];
                nums[breakPoint] = temp;
                break;
            }
        }
        //after the breakpoint value, we sort the rest part in ascending order, beacause we will get the next closest like this.
        //in this case, we just swapped because at first the array was in decreasing order, then swapping makes it ascending.ezpz
        int i = breakPoint+1;
        int j = n-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    } 
}