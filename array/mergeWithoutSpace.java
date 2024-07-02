class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        //arr1 starting
        int i = 0;
        //arr2 starting
        int j = 0;
        //arr1 ending, ekta kkore smaller element last e dhukabo and k-- kore piche jabo.
        int k = n - 1;

        while(i <= k && j < m){
            //if there exists an element in arr2 which is smaller than arr[i], we push it at the end of arr1.
            if(arr1[i] > arr2[j]){
                long temp = arr1[k];
                arr1[k] = arr2[j];
                arr2[j] = temp;
                j++; k--;
            }else{
                // if already sorted, we move i, no work is done
                i++;
            }
           
        }
        //at last both the array is sorted.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}