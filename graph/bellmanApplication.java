import java.util.ArrayList;

public class bellmanApplication {

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


    public static int[] bellman(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dst;
                int wt = e.wt;
                
                if (dist[u] + wt < dist[v] && dist[u] != Integer.MAX_VALUE) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
    
        // Check for negative cycles
        for (int j = 0; j < graph.size(); j++) {
            Edge e = graph.get(j);
            int u = e.src;
            int v = e.dst;
            int wt = e.wt;
    
            if (dist[u] + wt < dist[v] && dist[u] != Integer.MAX_VALUE) {
                // Negative cycle detected
                int[] result = new int[1];
                result[0] = -1;
                return result;
            }
        }
    
        // Set unreachable nodes to a large value
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = (int) Math.pow(10, 8);
            }
        }
    
        return dist;
    }


    public static void makeGraph(int edges[][], ArrayList<Edge> graph){

        for(int i = 0; i < edges.length; i++){
           
                int s = edges[i][0];
                int d = edges[i][1];
                int wt = edges[i][2];
                graph.add(new Edge(s, d, wt));
           
        }
    }


    public static void main(String args[]){
        int edges[][] = {{0,1,5},{1,0,3},{1,2,-1},{2,0,1}};
        int V = 3;
        int S = 2;
        ArrayList<Edge> graph = new ArrayList<>();
        makeGraph(edges, graph);
        int ans[] = bellman(graph, S, V);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

    }
}
