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