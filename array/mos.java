import java.util.*;

import javax.management.Query;


public class mos {
    static class Queries{
        int l;
        int r;
        public Queries(int l, int r){
            this.l = l;
            this.r = r;
        }
    }
    public static void main(String args[]){
        int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8}; 
        ArrayList<Queries> q = new ArrayList<>();
        q.add(new Queries(0,4));
        q.add(new Queries(1,3));
        q.add(new Queries(2,4));

        int block = (int)Math.sqrt(a.length);

        Collections.sort(q, new Comparator<Queries>() {
            public int compare(Queries x, Queries y){
                if(x.l/block != y.l/block){
                    return x.l/block < y.l/block ? -1 : 1;
                }
                return x.r < y.r ? -1 : 1;
            }
        });

        int sum = 0;
        int l = 0;
        int r = -1;
        
        for(int i = 0; i < q.size(); i++){
            int newL = q.get(i).l;
            int newR = q.get(i).r;
            while(newL > l){
                sum -= a[l];
                l++;
            }
            while(newL < l){
                l--;
                sum += a[l];
            }
            while(newR > r){
                r++;
                sum += a[r];
                
            }
            while(newR < r){
                sum -= a[r];
                r--;
            }
            System.out.println("Sum for range: ("+newL+","+newR+")---->"+sum);
        } 

    }
}
