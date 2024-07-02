//USING HASHMAP. T = O(N) AND S = O(N).

class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }
        return ans;
    }
}




//T = O(N) AND S = O(1). MORE OPTIMIZED

// Java program to print all elements that 
// appear more than once. 
import java.util.*; 
class GFG { 
  
    // function to find repeating elements 
    static void printRepeating(int arr[], int n) 
    { 
        // First check all the values that are 
        // present in an array then go to that 
        // values as indexes and increment by 
        // the size of array 
        let a value is 3, performing 3 % n will take us to index 3, where we add n. after complete loop. we run a second loop. in the second loop. if for an index i, if we divide the value
        by n, and we get >=2, it means that that index value i has appeared more than once, because we added n to it. thats how we measure the duplicates.
        for (int i = 0; i < n; i++)  
        { 
            int index = arr[i] % n; 
            arr[index] += n; 
        } 
  
        // Now check which value exists more 
        // than once by dividing with the size 
        // of array 
        for (int i = 0; i < n; i++)  
        { 
            if ((arr[i] / n) >= 2) 
                System.out.print(i + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 6, 3, 1, 3, 6, 6 }; 
        int arr_size = arr.length; 
  
        System.out.println("The repeating elements are: "); 
  
        // Function call 
        printRepeating(arr, arr_size); 
    } 
}
