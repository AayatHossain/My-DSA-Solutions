
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        //making the prefix array.
        long prefix[] = new long[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        
        //for the 0th index, there is no left sums, so the left sum is considered 0.
        long leftSum = 0;
        long rightSum = prefix[n-1] - prefix[0];
        if(leftSum == rightSum){
            return 0+1;
        }
        
        //from 1st index to the end, we calculate left sums and right sums. we compare if they are equal.
        for(int i = 1; i < n; i++){
            leftSum = prefix[i-1];
            rightSum = prefix[n-1] - prefix[i];
            if(leftSum == rightSum){
                return i+1;
            }
        }
        return -1;
    }
}
