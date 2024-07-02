//ezpz solution
class Solution {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}


//without sorting approach
class Solution {

    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i = 0; i < nums.length; i++){
           pq.add(nums[i]);
       }
       List<Integer> list = new ArrayList<>();
       while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        
       return list.get(list.size()-k);
    }
}

