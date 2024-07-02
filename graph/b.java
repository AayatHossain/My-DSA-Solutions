import java.util.ArrayList;
import java.util.PriorityQueue;

public class b{
    static class edge {
        int src, dest, wt;
        public edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        

    }

    static class pair implements Comparable<pair>{
        int dest;
        int cost;
        public pair(int v, int c){
            this.dest = v;
            this.cost = c;
        }
        @Override
        public int compareTo(pair that){
            return this.cost-that.cost;

        }
    }


    public static void countCost(int arr[][], int v, int source){
        ArrayList<edge> graph[] = new ArrayList[v];
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
            

        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
            
            int src = i;
            int dest = j;
            int wt = arr[i][j];
            graph[src].add(new edge(src, dest, wt));
            }
        }
        int n = graph.length;
        boolean visit[] = new boolean[n];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int cost = 0;
        
        for(int i = 0; i<graph[0].size(); i++){
                    
            edge e = graph[0].get(i);         
            pq.add(new pair(e.dest, e.wt));
        }
        visit[0] = true;
        while(!pq.isEmpty()){
            pair p = pq.remove();
            
            if(!visit[p.dest]){
                visit[p.dest] = true;
                cost += p.cost;
                pq.clear();
                for(int i = 0; i<graph[p.dest].size(); i++){
                    
                    edge e = graph[p.dest].get(i);         
                    pq.add(new pair(e.dest, e.wt));
                }
            }
        }
       
        int val = Integer.MAX_VALUE;
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].size(); j++){
                edge e = graph[i].get(j);
                System.out.println(e.dest);
                if(e.dest == 0 && e.src != 0){
                    val = Math.min(e.wt, val);
                }
                
            }
            
        }
        int result = cost+val;
        System.out.println(result);


    }


    public static void main(String args[]){
        int v = 5;
        int arr[][] = {{0,1000,5000},{5000,0,1000},
        {1000,5000,0}};
       
        countCost(arr, arr.length, 0);
    }
}
