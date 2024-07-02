import java.util.*;

public class cheapestFlightP2 {
    static class Pair{
        int v,  wt,  stops;
        public Pair(int v, int wt, int stops){
            this.v = v;
            this.wt = wt;
            this.stops = stops;
        }
    }


    static class Pair2 implements Comparable<Pair2>{
        int v,   wt,  stops;
        public Pair2(int v, int wt, int stops){
            this.v = v;
            this.wt = wt;
            this.stops = stops;
            
        }
        @Override
        public int compareTo(Pair2 that){
            return this.wt - that.wt;
        }
    }


    public static int cheap(int[][] arr, int n, int src, int dst, int stops){
        
        Queue<Pair> q = new LinkedList<>();
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        q.add(new Pair(src, 0, 0));
        while(!q.isEmpty()){
            
            Pair p = q.poll();
            if(p.stops > stops+1){
                break;
            }
            if(p.v == dst){
                pq.add(new Pair2(p.v, p.wt, p.stops));
                continue;
            }
            for(int i = 0; i < arr.length; i++){
                    if(arr[i][0] == p.v){
                        int u = arr[i][0];
                        int v = arr[i][1];
                        int wt = arr[i][2];
                        q.add(new Pair(v, p.wt+wt , p.stops+1));
                        
                    }
            }
            
        }
        System.out.println(pq);
       
        while(!pq.isEmpty()){
            Pair2 p = pq.poll();
            if(p.stops <= stops+2){
                return p.wt;
            }
        }
        return -1;
        
    }

    public static void main(String args[]){
        int arr[][] = {{0,1,1},{0,2,5},{1,2,1},{2,3,1}};
        int n = 4;
        System.out.println(cheap(arr, n, 0, 3, 1));
    }
}
