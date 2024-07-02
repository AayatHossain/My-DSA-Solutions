import java.util.*;
public class mostWater {
    public static void main(String args[]){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int maxWater = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int height = arr[j];
                    int width = j-i;
                    int area = height * width;
                    maxWater = Math.max(maxWater, area);
                }
        }
        }
        System.out.println(maxWater);
        
        
    }
}
