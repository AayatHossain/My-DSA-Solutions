//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
       Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                // Compare YX and XY lexicographically
                return (Y + X).compareTo(X + Y);
            }
        });
       String ans = "";
       for(int i = 0; i < arr.length; i++){
           ans += arr[i];
       }
       return ans;
    }
}