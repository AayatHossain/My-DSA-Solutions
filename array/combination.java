class combination {
 
    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Starting and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
 
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
 
        // Print all combination using temporary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
 
    /*Driver function to check for above function*/
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);

    }
}









// // Java program to print all combination of size r in an array of size n
// import java.io.*;
 
// class combination {
 
//     /* arr[]  ---> Input Array
//     data[] ---> Temporary array to store current combination
//     start & end ---> Starting and Ending indexes in arr[]
//     index  ---> Current index in data[]
//     r ---> Size of a combination to be printed */
//     static void combinationUtil(int arr[], int n, int r, int index,
//                                 int data[], int i)
//     {
//         // Current combination is ready to be printed, print it
//         if (index == r)
//         {
//             for (int j=0; j<r; j++)
//                 System.out.print(data[j]+" ");
//             System.out.println("");
//         return;
//         }
 
//         // When no more elements are there to put in data[]
//         if (i >= n)
//         return;
 
//         // current is included, put next at next location
//         data[index] = arr[i];
//         combinationUtil(arr, n, r, index+1, data, i+1);
 
//         // current is excluded, replace it with next (Note that
//         // i+1 is passed, but index is not changed)
//         combinationUtil(arr, n, r, index, data, i+1);
//     }
 
//     // The main function that prints all combinations of size r
//     // in arr[] of size n. This function mainly uses combinationUtil()
//     static void printCombination(int arr[], int n, int r)
//     {
//         // A temporary array to store all combination one by one
//         int data[]=new int[r];
 
//         // Print all combination using temporary array 'data[]'
//         combinationUtil(arr, n, r, 0, data, 0);
//     }
 
//     /*Driver function to check for above function*/
//     public static void main (String[] args) {
//         int arr[] = {1, 2, 3, 4, 5};
//         int r = 3;
//         int n = arr.length;
//         printCombination(arr, n, r);
//     }
// }
// /* This code is contributed by Devesh Agrawal */