public class rainWater {

    public static int trappedWater(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);

        }

        rightMax[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int total = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            total += (waterLevel) - arr[i];
        }
        return total;

    }

    public static void main(String arg[]){
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
        
        
    }
}
