class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
              
        int pivot= Integer.MAX_VALUE;
        int pivotIndex = Integer.MAX_VALUE;

        //findin the pivot
        for(int i = 1; i < n; i++){
            if(nums[i-1] > nums[i]){
                pivot = nums[i-1];
                pivotIndex = i-1;
                break;
            }
        }
        
        //if no pivot was found, means its already sorted
        if(pivot== Integer.MAX_VALUE){
            int sI = 0;
            int eI = n-1;
        
            while(sI <= eI){
                int mI = sI + (eI - sI)/2;
                if(target == nums[mI]){
                    return mI;
                
                }else if(target > nums[mI]){
                    sI = mI + 1;
                }else {
                    eI = mI -1;
                }
            }
        }else if(target==pivot){    //if the target is the pivot.
            return pivotIndex;
        }else if(pivot != Integer.MAX_VALUE){ // if the target exists on the left or right of pivot
        
        //left side of pivot binary search
        int sI = 0;
        int eI = pivotIndex-1;
        
        while(sI <= eI){
            int mI = sI + (eI - sI)/2;
            if(target == nums[mI]){
                return mI;
                
            }else if(target > nums[mI]){
                sI = mI + 1;
            }else {
                eI = mI -1;
            }
        }
         sI = pivotIndex+1;
         eI = n-1;
        
        //if doesnt exist, right side of pivot binary search
        while(sI <= eI){
            int mI = sI + (eI - sI)/2;
            if(target == nums[mI]){
                return mI;
                
            }else if(target > nums[mI]){
                sI = mI + 1;
            }else {
                eI = mI -1;
            }
        }
        }
        //if the element is not found, return -1;
        return -1;
    }
}