
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int ans[] = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            max = Math.max(max, A[i]);
        }
        int count[] = new int[max+1];
        
        for(int i = 0; i < A.length; i++){
            count[A[i]]++;
        }
        
        boolean Bfound = false;
        for(int i = 0; i < count.length; i++){
            if(count[i]==2){
                ans[0] = i;
               
            }
            if(count[i]==0 && i != 0){
                ans[1] = i;
                Bfound = true;
            }
        }
        if(!Bfound){
            ans[1] = ans[0]+ 1;
        }
        return ans;
    }
}
