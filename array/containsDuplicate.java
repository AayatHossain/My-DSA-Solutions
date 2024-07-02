class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(hm);
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}//my approach

//best approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
