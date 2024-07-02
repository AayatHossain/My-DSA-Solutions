https://www.geeksforgeeks.org/problems/permutations-in-array1747/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article


//sorting both in ascending, and comparing least of one to highest of the other and traversing like this will do the trick. also going like this means always yielding max possible value for
//a[i] + b[i]

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = b.length-1;
        while(i < n && j >= 0){
            if(a[i]+b[j] < k){
                return false;
            }else{
                i++; j--;
            }
        }
        return true;
    }
}