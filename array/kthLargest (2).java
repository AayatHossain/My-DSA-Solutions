import java.util.*;

public class kthLargest {
    //num will be sorted in descending order
    static class Num implements Comparable<Num>{
        int val;
        public Num(int val){
            this.val = val;
        }
        @Override
        public int compareTo(Num that){
            return that.val - this.val;
        }
    }

    public static void main(String args[]){
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        //priority queue to sort the elements in a decending way. 6 5 5 4 3 3 2 2 1
        PriorityQueue<Num> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.add(new Num(nums[i]));
        }
        int count = 0;
        while(!pq.isEmpty()){
            Num n1 = pq.poll();
            count++;
            //printed the 4th element from the queue, As we need the 4th largest.
            if(count == k){
                System.out.println(n1.val);;
            }
        }
    
    }
}
