import java.util.*;



public class cheapestFlight {

    static class edge{
        int src;
        int dest;
        int cost;
        public edge(int s, int d, int c){
            this.src = s;
            this.dest = d;
            this.cost = c;
        }

        // @Override
        // public int compareTo(edge that){
        //     return this.cost-that.cost;
        // }

    }


    // public static void createDijkstrarsGraph(int arr[][], int v){
    //     ArrayList<edge> graph[] = new ArrayList[v];
    //     for(int i = 0; i<graph.length; i++){
    //         graph[i] = new ArrayList<>();
    //     }

    //     for(int i = 0; i<arr.length; i++){
            
    //             int src = arr[i][0];
    //             int dest = arr[i][1];
    //             int wt = arr[i][2];
               
    //             graph[i].add(new edge(src, dest, wt));
    //     }

   
      

    // }

    static class pair {
        int dest, cost, stops;
        public pair(int d, int c, int s){
            this.dest = d;
            this.cost = c;
            this.stops = s;
        }
        
    }


    public static void cheapestFlights(int arr[][], int v1, int src, int dest, int k){
        ArrayList<edge> graph[] = new ArrayList[v1];
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<arr.length; i++){
            
                int src1 = arr[i][0];
                int dest1 = arr[i][1];
                int wt1 = arr[i][2];
               
                graph[src1].add(new edge(src1, dest1, wt1));
        }

        boolean visit[] = new boolean[graph.length];
        int dist[] = new int[graph.length];
        for(int i = 0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<pair> pq = new LinkedList<>();
        pq.add(new pair(src, 0, 0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            int c = curr.dest;
            if(curr.stops >k){
                break;
            }
            //break condition use na kore another way te kora jay. if not visited, then make it visit and perform the operations korleo hobe, like dijkstra
            for(int i = 0; i<graph[c].size(); i++){
                edge e = graph[c].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.cost;
                if(dist[u]+wt<dist[v] && curr.stops<=k){
                    dist[v] = dist[u]+wt;
                    
                }
                pq.add(new pair(v, dist[v], curr.stops+1));
            }
            

        }
        


        if(dist[dest] == Integer.MAX_VALUE){
            System.out.println("-1");
        }else{
            System.out.println(dist[dest]);
        }


    }


    public static void main(String args[]){
        int v = 4;
        int arr[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        cheapestFlights(arr, 4, 0, 3, 1);
    }
}
