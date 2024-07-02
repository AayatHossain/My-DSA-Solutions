
//time O(N), space O(1) SOLUTION.

// https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401?leftPanelTab=0&leftPanelTabValue=SUBMISSION

public class ceilSorted{
    public static void main(String[] args) {
        int a[] = {1, 2, 8, 10, 10, 12, 19};
        int floor = -1;
        int ceil = -1;
        int x = 5;

        for(int i = 0; i < a.length; i++){

            //x exists in array means its both ceil and floor. 1 er ceil floor both 1
            if(a[i]==x){
                floor = x;
                ceil = x;
                System.out.println(floor+" "+ceil);
                return;
            }
        }
        //in case x doesnt exist in array
        for(int i = 0; i < a.length; i++){
            //if ceil is found, only then floors can be assigned.
            if(a[i] > x){
                ceil = a[i];
                //previous index of ceil is floor, but, if index is -1, then floor doesnt exist, so floor becomes -1
                if(i-1 < 0 ){
                    floor = -1;
                    break;
                }
                //if i-1 is not equal to -1
                if(a[i-1] < x){
                    floor = a[i-1];
                    break;
                }
            }
        }
        //if no ceil was found, it means the value is largest, so last element will be the floor and x will have no ceil, ceil will be -1;
        if(ceil == -1){
            floor= a[a.length-1];
        }
        System.out.println(floor+" "+ceil);
    }
}










