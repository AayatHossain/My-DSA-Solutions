// https://practice.geeksforgeeks.org/problems/longest-path-in-a-directed-acyclic-graph/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab


import java.util.*;

public class longestPath {

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
        //longest path problem is the reverse of shortest path. So we can solve it with some inverse conditions.
        
        public static int[] bellman(ArrayList<Edge> graph, int src, int v){
            int dist[] = new int[v];

            //here, we are assigning negative infinity, because if any distance is found, it will definitely be the larger
            //distance than the negative infinity
            for(int i = 0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MIN_VALUE;
            }
            }

            //bellan application - outer loop runs v-1 times because there will be at least v-1 edges
            //inner loop runs thru all the edges every time and updates the values.
            for(int i = 0; i<v-1; i++){
                //if no change is made in the distance for a whole inner loop(the j loop), it means that
                //further iteration is not needed. So if the updated value stays false, we just can break the operation. This will save a lot of time. And its important.
                boolean updated = false;
                for(int j = 0; j<graph.size(); j++){
                    Edge e = graph.get(j);
                    int u = e.src;
                    int vv = e.dst;
                    int wt = e.wt;

                    //the main part. Here, conditions are reversed as we need longest distance, not shortest distance.
                    //if any distance is found, it will definitely be the larger
                     //distance than the negative infinity
                     // the condition to check if u is neg infinity must be written first, otherwise time complexity error will occur
                    if(dist[u] != Integer.MIN_VALUE && dist[u]+wt > dist[vv]){
                        dist[vv] = dist[u]+wt;
                        //if a single change is made, update is made true.
                        updated = true;
                    }
                }
                //if no change is made in the distance for a whole inner loop(the j loop), it means that
                //further iteration is not needed. So if the updated value stays false, we just can break the operation. This will save a lot of time. And its important.
                if (!updated) {
                break;
                }
            }
            return dist;
        }


        public static void makeGraph(ArrayList<Edge> graph, int edges[][]){
            for(int i = 0; i < edges.length; i++){
                graph.add(new Edge(edges[i][0], edges[i][1], edges[i][2]));
            }
        }

    public static void main(String args[]){
        int edges[][] = {{0,1,5},{0,2,3},{1,3,6},{1,2,2},{2,4,4},{2,5,2},{2,3,7},{3,5,1},{3,4,-1},{4,5,-2}};
        int v = 6;
        int src = 1;
        ArrayList<Edge> graph = new ArrayList<>();
        makeGraph(graph, edges);
        int dist[] = bellman(graph, src, v);
        for(int i = 0; i < dist.length; i++){
            System.out.println(dist[i]);
        }
    }
}
