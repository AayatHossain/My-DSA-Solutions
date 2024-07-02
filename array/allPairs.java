class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        int n = A.length;
        int m = B.length;
        
        List<pair> list = new ArrayList<>();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
       for(int i = 0; i < n; i++){
           int j = m-1;
           while(j >= 0){
               if(A[i] + B[j] == X){
                   list.add(new pair(A[i], B[j]));
                   j--;
               }else if(A[i] + B[j] > X){
                   j--;
               }else{
                   break;
               }
           }
       }
        
        pair pairArray[] = new pair[list.size()];
        for(int i = 0; i < pairArray.length; i++){
            pairArray[i] = list.get(i);
        }
       
        
        return pairArray;
        
        
        
        
        
        
        
    }
}