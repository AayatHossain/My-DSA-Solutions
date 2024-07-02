import java.util.*;
public class hw {
    public static int binarySearch(int arr[],int key){
        
        int sI = 0;
        int eI = arr.length-1;
        
        while(sI <= eI){
            // int mI = (sI+eI)/2; we can use this as well. the later one is used to avoid potential integer overflow issues.
            int mI = sI + (eI - sI)/2;
            if(arr[mI]==key){
            return mI;
        }
            if(key > arr[mI]){
               sI = mI + 1;
            }
            if(key < arr[mI]){
                eI = mI - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {3, 7, 9, 10, 15};
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Location of "+ n+" is: " + binarySearch(a, n));
    }
}
