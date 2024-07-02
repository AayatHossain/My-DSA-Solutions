import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class numProvinceLeetcode {

    static class Edge{
        int src;
        int dst;
       
        public Edge(int s, int d){
            this.src = s;
            this.dst = d;
            
        }
    }

    public static void makeGraph(int[][] isConnected, ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected[i].length; j++){
                if(isConnected[i][j]==1){
                    int dst = j;
                    int src = i;
                    graph[src].add(new Edge(src, dst));
                }
            }
        }
    }

    
    public static void DFS(ArrayList<Edge> graph[], int v, boolean visit[], boolean globalVisit[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visit[curr]){
                visit[curr]=true;
                globalVisit[curr] = true;// MAKING THE ELEMENT VISITED IN GLOBAL VISIT SO THAT WE DONT DO DFS OF THAT ELEMENT IN THE FUTURE.FOR EXAMPLE, DFS OF 0 MAKES 0--1--5, AFTER THIS, WE MAKE 0,1,5 VISITED IN GLOBAL VISIT SO THAT THE DFS ARE NOT PERFORMED ON THEM AGAIN.
                

                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    DFS(graph, e.dst, visit, globalVisit);
                }
            }
        }
    }

    
    static boolean globalVisit[];

    //LOGIC- 0---1---5 
    //          3
    //      2---4----6
    //SO TOTAL 3 PROVINCES. DFS ON 0 IS PERFOMED, 1 PROVINCE IS FOUND. DFS ON 3 IS PERFOMED, 1 PROVINCE IS FOUND AND DFS ON 2 IS PERFORMED, 1 PROVINCE IS FOUND. SO TOTAL 3 PROVINCE
    public static int countProvince(ArrayList<Edge> graph[], boolean globalVisit[]){
        int count = 0;
        for(int i = 0; i < graph.length; i++){
            if(!globalVisit[i]){//IF THE VERTEX IS NOT VISITED IN GLOBAL VISIT, WE DO ITS DFS, 
                DFS(graph, i, new boolean[graph.length], globalVisit);
                count++;
            }
        }
        return count;
    }



    public static void main(String args[]){
          
        int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
        int n = isConnected.length;
        globalVisit= new boolean[n];
        ArrayList<Edge> graph[] = new ArrayList[n];
        makeGraph(isConnected, graph);
        System.out.println(countProvince(graph, globalVisit));
        

    }
}
