public class slidingWindowDynamic {
    public static int slidingDynamic(int a[], int key){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int j = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            while(sum >= key ){
                min = Math.min(min, i-j+1);
                sum -= a[j];
                j++;
            }
        }
        return min;
    }


    public static void main(String args[]){
        int a[] = {4,2,1,7,8,1,2,8,1,0};
        System.out.println(slidingDynamic(a, 8));
       
 
 
 
 
     }




}
