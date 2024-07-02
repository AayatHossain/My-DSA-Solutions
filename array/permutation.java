import java.util.*;

public class permutation{


    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean isSorted(int a[]){
        for(int i = 1; i < a.length; i++){
            if(a[i]< a[i-1]){
                return false;
            }

        }
        return true;
    }


    public static void main(String args[]){
        int[] nums = {1,5,1};

       
        if(isSorted(nums)){
            swap(nums, 1,2);
        }else{
            int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int index = 0;
        Arrays.sort(nums);
        boolean flag = false;

        for(int i = 1; i <= 5; i++){
            if(!flag){
                if(i==1){
                    swap(nums, 1,2);
                    if(nums[0]==a && nums[1]==b && nums[2]==c){
                        flag = true;
                        index = i+1;
                        
                        Arrays.sort(nums);
                        break;
                    }
                    Arrays.sort(nums);
                    for(int k = 0; k < nums.length; k++){
                        System.out.print(nums[k]+" ");
                        
                    }
                    System.out.println();


                }else if(i==2){
                    swap(nums, 0,1);
                    if(nums[0]==a && nums[1]==b && nums[2]==c){
                        flag = true;
                        index = i+1;
                        Arrays.sort(nums);
                        break;
                    }
                    Arrays.sort(nums);
                }else if(i==3){
                    swap(nums, 0,1);
                    swap(nums, 1,2);
                    if(nums[0]==a && nums[1]==b && nums[2]==c){
                        flag = true;
                        index = i+1;
                        Arrays.sort(nums);
                        break;
                       
                    }
                    Arrays.sort(nums);
                }else if(i==4){
                    swap(nums, 1,2);
                    swap(nums, 0,1);
                    if(nums[0]==a && nums[1]==b && nums[2]==c){
                        flag = true;
                        index = i+1;
                        Arrays.sort(nums);
                        break;
                       
                    }
                    Arrays.sort(nums);
                }else if(i==5){
                    swap(nums, 0,2);
                    if(nums[0]==a && nums[1]==b && nums[2]==c){
                        flag = true;
                        index = i+1;
                        Arrays.sort(nums);
                        break;
                        
                    }
                    Arrays.sort(nums);
                }
            }
        }

        
            if(flag){
                if(index==1){
                    swap(nums, 1,2);
                   

                }else if(index==2){
                    swap(nums, 0,1);
                   
                }else if(index==3){
                    swap(nums, 0,1);
                    swap(nums, 1,2);
                   
                }else if(index==4){
                    swap(nums, 1,2);
                    swap(nums, 0,1);
                   
                }else if(index==5){
                    swap(nums, 0,2);
                    
                }
            }
        }


        
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i]+" ");
            }
        

    }
}