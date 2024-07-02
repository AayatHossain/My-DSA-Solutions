import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberofOperationstoMakeNetworkConnected {

    static class Edge{
        int src;
        int dst;
       
        public Edge(int s, int d){
            this.src = s;
            this.dst = d;
           
        }
    }


    public static int DFS(ArrayList<Edge> graph[], int v, boolean visit[]){
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visit[curr]){
                visit[curr]=true;
                // System.out.println(curr);
                count++;
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    DFS(graph, e.dst, visit);
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int connections[][] = {{0,1},{0,2},{1,2}};
        int n = 4;
        if (connections.length < n - 1) {
            System.out.println(-1);;
        }

        ArrayList<Edge> graph[] = new ArrayList[n];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        
        for (int[] c : connections) {
            graph[c[0]].add(new Edge(c[0], c[1]));
            graph[c[1]].add(new Edge(c[1], c[0]));
        }

        boolean visit[] = new boolean[n];
        int components = 0;
        for(int i = 0; i < graph.length; i++){
            if(!visit[i]){
            components += DFS(graph, i, visit);
            }
        }
        System.out.println(components-1);
    }
}
