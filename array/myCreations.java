public class myCreations {
    public static void selectionSort(int a[]){
        int j = a.length-1;
       

        while(j >= 0){
            int hI = Integer.MIN_VALUE;
            int high = Integer.MIN_VALUE;
            for(int i = 0; i <= j; i++){
                
                    if(a[i] > high){
                        high = a[i];
                        hI = i;
                    }
                    
                }
                int temp = a[j];
                a[j] = a[hI];
                a[hI] = temp;
                j--;
            }
            
        }
}
