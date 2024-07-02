
//https://leetcode.com/problems/network-delay-time/description/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class networkDelay {
    static class Edge{
        int src;
        int dst;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    //pair for Disjktrar
    static class pair implements Comparable<pair>{
        int v;
        int wt;
        public pair(int v, int wt){
            this.v = v;
            this.wt = wt;
        }
        @Override
        public int compareTo(pair p2){
            return this.wt-p2.wt;
        }
    }


    //making graph from the array
    public static void makeGraph(int times[][], ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < times.length; i++){
                //given 1 index baseed, but we need 0 index based.
                int s = times[i][0]-1;
                int d = times[i][1]-1;
                int wt = times[i][2];
                graph[s].add(new Edge(s, d, wt));
            
        }
    }

        //modified disjktra returning answer. We need to return the maximum distance from a src to a destination(unspecified). This is the minimum distance(answer).
        //because to reach all the vertex, this maximum distance first appears and this is the minimum for the answer.
        public static int dijkstra(ArrayList<Edge> graph[], int src){
        boolean visit[] = new boolean[graph.length];
        
        
        int dist[] = new int[graph.length];

        for(int i = 0; i<dist.length; i++){
        if(i != src){
            dist[i] = Integer.MAX_VALUE;
        }
        }
        
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!visit[curr.v]){
                visit[curr.v] = true;
                for(int i = 0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    int u = e.src;
                    int v = e.dst;
                    int wt = e.wt;
                    if(dist[u]+wt<dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }
        

        //we traverse through the distance array, if any vertex has infinite value, it means that vertex cant be reached. if all vertex is reached, we return the max value as the ans.
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<dist.length; i++){
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            ans = Math.max(ans, dist[i]);
        }
        return ans;
        
    }


    public static void main(String args[]){
        int[][] times = {{2,1,1},
                        {2,3,1},
                        {3,4,1}};
        //draw the graph yourself or see the link

        int n = 4;
        int k = 2;
        //we are using 0 index based. so i = k-1 is used
        int i = k-1;
        ArrayList<Edge> graph[] = new ArrayList[n];
        makeGraph(times, graph);
        System.out.println(dijkstra(graph, i));

    }
}
