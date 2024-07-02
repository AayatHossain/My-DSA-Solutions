import java.util.*;

public class MST {
    
    static class Edge{
        int s; 
        int d;
        int wt;
        public Edge(int s, int d, int wt){
            this.s = s;
            this.d = d;
            this.wt = wt;
        }
    }
    
    static class Pair implements Comparable<Pair>{
        int v; 
        int wt;
        public Pair(int v, int wt){
            this.v = v;
            this.wt = wt;
        }
        @Override
        public int compareTo(Pair that){
            return this.wt - that.wt;
        }
    }

    public static void main(String args[]){
        int edges[][] = {{3, 3, 0},
                         {0, 1, 5},
                         {1, 2, 3},
                         {0, 2, 1}};

        int V = 3;


        //making of the graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        int n = graph.length;
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < edges.length; i++){
            if(edges[i][2]==0){
                continue;
            }
            int s = edges[i][0];
            int d = edges[i][1];
            int wt = edges[i][2];
            graph[s].add(new Edge(s, d, wt));
            graph[d].add(new Edge(d, s, wt));

        }


        //mst function
        int cost = 0;
        PriorityQueue<Pair> q = new PriorityQueue<>();
        boolean visit[] = new boolean[V];
        q.add(new Pair(0, 0));
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!visit[curr.v]){
                
                visit[curr.v] = true;
                cost += curr.wt;
                for(int i = 0; i < graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    q.add(new Pair(e.d, e.wt));
                }
            }
            
        }
        System.out.println(cost);



    }
}
