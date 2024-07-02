import java.util.*;

public class practice{


    public static int partition(int a[], int s, int e){
        int pivot = a[e];
        int i = s-1;
        for(int j = s; j < e; j++){
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        a[e] = a[i];
        a[i] = pivot;
        return i;
    }


    public static void quickSort(int a[], int s, int e){
        if(s>= e){
            return;
        }
        int pi = partition(a, s, e);
        quickSort(a, s, pi-1);
        quickSort(a, pi+1, e);
    }



    public static void main(String args[]){
      int a[] = {5,3,4,1,2};
      int n = a.length;
      quickSort(a, 0, n-1);
      


      for(int i = 0; i < n; i++){
        System.out.print(a[i]+" ");
      }
        




    }
}