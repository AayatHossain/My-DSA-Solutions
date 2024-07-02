import java.util.*;

public class allPathsLeetcode{

    static class Edge{
        int s, d;
        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }

    public static void makeGraph(int graph[][], ArrayList<Edge> g[]){
        for(int i = 0; i < g.length; i++){
            g[i] = new ArrayList<>();
        }
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length; j++){
                int s = i;
                int d = graph[i][j];
                g[s].add(new Edge(s, d));
            }
        }
    }

    public static void allPaths(List<List<Integer>> list,List<Integer> listSub , int src, int dst, ArrayList<Edge> g[]){
        if(src==dst){

            list.add(new ArrayList<>(listSub));  // Create a new instance of listSub and add it to list
            return;
        }
        
        for(int j = 0; j < g[src].size(); j++){
            Edge e = g[src].get(j);
            listSub.add(e.d);
            allPaths(list, listSub, e.d, dst, g);
            listSub.remove(listSub.size() - 1); 
        }
    }



    public static void main(String args[]){
        int graph[][] = {{1,2}, {3}, {3}, {}};
        int n = graph.length;
        ArrayList<Edge> g[] = new ArrayList[n];
        makeGraph(graph, g);
        int src = 0;
        int dst = n-1;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listSub = new ArrayList<>();
        listSub.add(src);
        allPaths(list, listSub, src, dst, g);
        
        System.out.println(list);



    }
}