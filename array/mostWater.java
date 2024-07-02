
https://leetcode.com/problems/container-with-most-water/description/

class Solution {
    public int maxArea(int[] arr) {
      int i = 0;
      int j = arr.length - 1;
      int max = Integer.MIN_VALUE;
      while(i < j){
            //minimum tai waterlevel hoy/
            int height = Math.min(arr[i], arr[j]);
            //finding area, height*distance, j-i is the distance.
            int curr = height*(j-i);
            max = Math.max(max, curr);
            //left or right theke reduce hole distance emnei kombe, so we need to increase height. thats why, jei pointer er height kom, oita ke agaisi, hoping that we will find a bigger height. 
            //if a[i] height cholo, then i reduce
            if(arr[i] < arr[j]){
                i++;
            }else {
                j--;  // if a[j] height choto, j reduce, ei else e a[i] = a[j] o pore, in that case, jekono ekta reduce korlei hoy, so we reduced j.
            }
      }
      return max;
    }
}