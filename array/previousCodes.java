
//KTH LARGEST ELEMENT


class Solution {

    static class Num implements Comparable<Num>{
        int val;
        public Num(int val){
            this.val = val;
        }
        @Override
        public int compareTo(Num that){
            return that.val - this.val;
        }
    }


    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Num> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(new Num(nums[i]));
        }
        int count = 0;
        while(!pq.isEmpty()){
            Num n1 = pq.poll();
            count++;
            if(count == k){
                return n1.val;
            }
        }
        return -1;
    }
}



//KTH LARGEST ELEMENT







153. Find Minimum in Rotated Sorted Array
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






15. 3Sum
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> s = new HashSet<>();

        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++){
            int j = i+1; 
            int k = n-1;
            while(j < k){
                if(arr[j]+arr[k]== - arr[i]){
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    s.add(list);
                    j++;
                    k--;  
                }else if(arr[j]+arr[k] > -arr[i]){
                    k--;
                }else{
                    j++;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
}






33. Search in Rotated Sorted Array

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






