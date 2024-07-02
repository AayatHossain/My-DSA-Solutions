import java.util.*;


public class repeatMissing {
    public static void main(String args[]){
        int A[] = {4, 4, 1, 2};
        int ans[] = new int[2];
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            //if the element apprears twice, we have got our answer
            if(seen.contains(A[i])){
                ans[0] = A[i];
                
            }else{
                seen.add(A[i]);
            }
        }
       
        
       //if the array only contains 1. then 1 is A and 2 is B;
        if(seen.size()==1 && seen.contains(1)){
            ans[1] = ans[0] + 1;
        } else{
            //the element which is missing from 1 to A.length in the hashtable is our answer. we are doing 1 to A.length because the increment of array elements is 1. 1 2 3 4 5 6 etc.
            for(int i = 1; i < A.length; i++){
            if(!seen.contains(i)){
                ans[1] = i;
            }
        }
        }

        
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
