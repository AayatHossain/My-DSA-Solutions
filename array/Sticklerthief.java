class Solution
{
    public int max(int arr[], int n, int i){
        if(i >= n){
            return 0;
        }
        return Math.max(arr[i] + max(arr, n, i+2), max(arr, n, i+1));
    }
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
       int total = max(arr, n, 0);
       return total;
    }
}

//LEARN OPTIMIZED VERSION AFTER LEARNING DP
