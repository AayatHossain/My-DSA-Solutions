
//same as two sum
// but complexity is not O(n) its O(n*logn). logn for sorting, n for two pointers


import java.util.Arrays;

public class pairRotated {


    //its complexity is n
    public static void nComplexity(int a[], int x){
        int pivotIndex = Integer.MIN_VALUE;
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                pivotIndex = i-1;
                break;
            }
        }


        //finding pair without pivot
        int j = 0;
        int k = a.length-1;
        while(j < k){
            if(a[j]+a[k] == x){
                    System.out.println(a[j]+","+a[k]);
                    k--;
                    j++;
                }else if(a[j]+a[k] > x){
                    k--;
                }else{
                    j++;
                }
        }




        //finding pair on the left of pivot
         j = 0;
         k = pivotIndex-1;
        while(j < k){
            if(a[j]+a[k] == x){
                    System.out.println(a[j]+","+a[k]);
                    k--;
                    j++;
                }else if(a[j]+a[k] > x){
                    k--;
                }else{
                    j++;
                }
        }
        

        //finding pair on the right of pivot
         j = pivotIndex+1;
         k = a.length-1;
        while(j < k){
            if(a[j]+a[k] == x){
                    System.out.println(a[j]+","+a[k]);
                    k--;
                    j++;
                }else if(a[j]+a[k] > x){
                    k--;
                }else{
                    j++;
                }
        }


        //finding pair where pivot is 1 element, and others are 2nd element(pivot, a[i])
        for(int i = 0; i < pivotIndex; i++){
            if(a[pivotIndex]+a[i]==x){
                System.out.println(a[pivotIndex]+","+a[i]);
            }
        }
        for(int i = pivotIndex+1; i < a.length; i++){
            if(a[pivotIndex]+a[i]==x){
                System.out.println(a[pivotIndex]+","+a[i]);
            }
        }
    }





    //its complexity is nlogn
    public static void nlognComplexity(int a[], int x){
         Arrays.sort(a);
        int i = 0;
        int j = a.length -1;
        while(i < j){
            if(a[i]+a[j] == x){
                System.out.println(a[i]+","+a[j]);
                i++;
                j--;
            }else if(a[i]+a[j] > x){
                j--;
            }else{
                i++;
            }
        } 
    }



    //its the best approach, from gfd, time complexity is n.
    public static void pairs(int a[], int x){
        
    }




    public static void main(String args[]){
        int a[] = {2,4,6,5,4,2,1};
        int x = 6;

        // nComplexity(a, x);
        nlognComplexity(a, x);



    }
}
