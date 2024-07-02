class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        //making a count array, because, let 1 appeared 3 times, and this 3 times is the max
        //count. so there will be max 3 rows, where 1 will be included.
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
        }
        int count[] = new int[max+1];
        for(int i = 0; i < n; i++){
            count[nums[i]]++;
        }
        
         max = Integer.MIN_VALUE;
         int maxIndex = Integer.MIN_VALUE;
        for(int i = 0; i < count.length; i++){
            if(count[i] > max){
                maxIndex = i;
            }
            max = Math.max(count[i], max);
        }

        //so, maxIndex is the number appeared most times, and count[maxIndex] is the count of it

        //there will be count[maxIndex] times of rows, including maxIndex
        while(count[maxIndex] > 0){
            List<Integer> list = new ArrayList<>();
            list.add(maxIndex);
            //traversing the count array, including digits, and reducing their count by 1
            for(int i = 0; i < count.length; i++){
                if(i != maxIndex && count[i] > 0){
                    list.add(i);
                    count[i]--;
                }
            }
            ans.add(list);
            count[maxIndex]--;
        }
        return ans;
    }
}