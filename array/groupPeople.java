class Solution {
    public List<List<Integer>> groupThePeople(int[] a) {
        int n = a.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            hm.put(i, a[i]);
        }
        List<Integer> sub = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
                
                if(entry.getValue()==i){
                    sub.add(entry.getKey());
                    count++;
                    if(count==i){
                        count = 0;
                        ans.add(new ArrayList<>(sub));  // Add a copy of 'sub'
                        sub.clear();
                    }
                }
            }
        }
        return ans;
    }
}