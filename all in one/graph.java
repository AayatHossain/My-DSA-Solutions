import java.util.*;
public class graph{
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

    //create main format graph from 2D array -1
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

//create main format graph from 2D array -2
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



//create main format graph from 2D array -3
public static void makeGraph(int graph[][], ArrayList<Edge> g[]){
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
}

    public static void createUndirectedGraph(ArrayList<Edge> graph[]){
        

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));        
        graph[0].add(new Edge(0, 2, 5)); 
 

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3, 1));
        

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));


        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));       
        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 2));

        graph[6].add(new Edge(6, 5, 2));


        

    }



        public static void createDirectedGraph(ArrayList<Edge> graph[]){
        

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3, 5));        
         
 

        graph[5].add(new Edge(5, 0, 5));
        graph[5].add(new Edge(5,2, 1));
        
        graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 1, 3));
    
        graph[4].add(new Edge(4, 0, 2));
        graph[4].add(new Edge(4, 1, 2));
        

    }



    public static void createTopSortGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
    
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }



    public static void createDijkstrarsGraph(ArrayList<Edge> graph[]){
        

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));        
        graph[0].add(new Edge(0, 2, 4)); 
 
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        
        graph[2].add(new Edge(2, 4, 3));
        
        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 3, 2));        
        graph[4].add(new Edge(4, 5, 5));      
      

    }


    public static void createPrimGraph(ArrayList<Edge> graph[]){
        

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));        
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

 
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        
        graph[3].add(new Edge(3, 0, 30));   
        graph[3].add(new Edge(3, 1, 40));        
        graph[3].add(new Edge(3, 2, 50));      
      

    }


    public static void createBellmanGraph(ArrayList<Edge> graph){
        
        graph.add(new Edge(0, 1, 2));        
        graph.add(new Edge(0, 2, 4)); 
 
        graph.add(new Edge(1, 2, -4));
        
        
        graph.add(new Edge(2, 3, 2));
        
        graph.add(new Edge(3, 4, 4));
        
        graph.add(new Edge(4, 1, -1));        
       
      

    }




    public static void BFS(ArrayList<Edge> graph[], int v){
        Queue<Integer> pq = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
        pq.add(v);
        while(!pq.isEmpty()){
            int curr = pq.remove();
            if(!visit[curr]){
                visit[curr]=true;
                System.out.println(curr);
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    pq.add(e.dst);
                }
            }
        }
    }


    public static void DFS(ArrayList<Edge> graph[], int vertex, boolean visit[]){
        if(visit[vertex]){
            return;
        }
        System.out.println(vertex);
        visit[vertex] = true;
        for(int i = 0; i < graph[vertex].size(); i++){
            Edge e = graph[vertex].get(i);
            DFS(graph, e.d, visit);
        }
    }


    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean visit[]){
        
        if(src==dest){
            return true;
        }
        visit[src] = true;
        for(int i = 0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visit[e.dst] && hasPath(graph, e.dst, dest, visit)){
                return true;
            }
        }
        return false;
        
    }

    //all paths directed graph string version
    
    public static void allPaths(ArrayList<Edge> graph[], int src, int dest, String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i = 0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            allPaths(graph, e.dst, dest, path+src);
            
        }
    }


    //all paths directed graph count
    static int count1 = 0;
    public static void allPathsCount(ArrayList<Edge> graph[], int src, int dest){
        if(src==dest){
            count1++;
            return;
        }
        for(int i = 0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            allPathsCount(graph, e.dst, dest);
            
        }
    }



    //pair class for dijkstrar
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


    //NOTES FOR DIJKSTRAR'S ALGORITHM

    //priority queue, visit[], dist[]
    //dist all infinity except src
    //pq drags all least weighted vertex, and after dragging the vertex, we mark the vertex as visited so that no greater values ar added

    public static void dijkstra(ArrayList<Edge> graph[], int src){
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
        
        for(int i = 0; i<dist.length; i++){
            System.out.println(dist[i]);
        }
    }




    //perform this operation V-1 times
    //only distance array needed, no pq and visit
    //need to input vertex cuz bellman graph has only edges
    
    public static void bellman(ArrayList<Edge> graph, int src, int V){
        
        int dist[] = new int[V];
        for(int i = 0; i<dist.length; i++){
        if(i != src){
            dist[i] = Integer.MAX_VALUE;
        }
        }
        
        for(int i = 0; i<V-1; i++){
            for(int j = 0; j<graph.size(); j++){
                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dst;
                int wt = e.wt;
                if(dist[u]+wt<dist[v] && dist[u] != Integer.MAX_VALUE ){
                    dist[v] = dist[u]+wt;
                    
                }
            }
        }
        for(int i = 0; i<dist.length; i++){
            System.out.println(dist[i]);
        }
    }


    public static int prim(ArrayList<Edge> graph[], int src){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean visit[] = new boolean[graph.length];
        int cost = 0;
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!visit[curr.v]){
                visit[curr.v] = true;
                cost += curr.wt;
                for(int i = 0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.dst, e.wt));
                }
            }
        }
        return cost;
    }



    //KRUSKAL START
    static class edgeKruskal implements Comparable<edgeKruskal>{
        int s;
        int wt;
        int d;
        public edgeKruskal(int s, int d, int wt){
            this.s = s;
            this.wt = wt;
            this.d = d;
        }
        @Override
        public int compareTo(edgeKruskal p2){
            return this.wt-p2.wt;
        }
    }



        // static int[] par, rank;
        // static int n = 4;
        
        // public static void init(){
        //     par = new int[n];
        //     rank = new int[n];
            
        //     for(int i = 0; i<n; i++){
        //         par[i] = i;
        //     }
        // }




 
        
        static class DS {
            int[] par, rank;
            int n;
            public DS(int n){
                this.n = n;
                par = new int[n];
                rank = new int[n];
                for(int i = 0; i<n; i++){
                    par[i] = i;
                }
            }
            int find(int x){
                if(par[x] != x){
                    par[x] = find(par[x]);
                }
                return par[x];
            }
            void union(int x, int y){
                int xRoot = find(x);
                int yRoot = find(y);
                if(xRoot==yRoot){
                    return;
                }
                if(rank[xRoot] > rank[yRoot]){
                    par[yRoot] = xRoot;
                }
                else if(rank[xRoot] < rank[yRoot]){
                    par[xRoot] = yRoot;
                } else {
                    par[yRoot] = xRoot;
                    rank[xRoot] = rank[xRoot]+1;
                }
            }
        }


    public static void KruskalGraph(ArrayList<edgeKruskal> edges){
        edges.add(new edgeKruskal(0, 1, 10));        
        edges.add(new edgeKruskal(0, 2, 15));
        edges.add(new edgeKruskal(0, 3, 30));
        edges.add(new edgeKruskal(1, 3, 40));
        edges.add(new edgeKruskal(2, 3, 50));

    }

    

    public static void kruskal(ArrayList<edgeKruskal> edges , int V){
        
        DS ds = new DS(V);
        Collections.sort(edges);
        int cost = 0;
        int count = 0;
        for(int i = 0; count < V-1; i++){
            edgeKruskal e = edges.get(i);
            int xRoot = ds.find(e.s);
            int yRoot = ds.find(e.d);

            if(xRoot != yRoot){
                ds.union(e.s, e.d);
                cost += e.wt;
                count++;
            }
        }
        System.out.println(cost);
    }
    //KRUSKAL END


    //TOPOLOGICAL SORT START
    public static void calculateIndegree(ArrayList<Edge> graph[], int indeg[]){
       
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indeg[e.d]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        int indeg[] = new int[graph.length];
        calculateIndegree(graph, indeg);
        for(int i = 0; i < indeg.length; i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int v = q.remove();
                System.out.println(v);
                for(int i = 0; i < graph[v].size(); i++){
                    Edge e = graph[v].get(i);
                    indeg[e.d]--;
                    if(indeg[e.d]==0){
                        q.add(e.d);
                    }
                    

                }
           
        }
    }
    //TOPOLOGICAL SORT END


    public static void main(String args[]){
        // int v = 7;
        // ArrayList<Edge> graph[] = new ArrayList[v];
        // boolean visit[] = new boolean[graph.length];
        
        //1's neighbours
        // for(int i = 0; i<graph[1].size(); i++){
        //     Edge e = graph[1].get(i);
        //     System.out.print(e.dst+" ");
        // }
        // BFS(graph, 0);
        // System.out.println(hasPath(graph, 0, 10, visit));
        // allPaths(graph, 0, 1, "");
        // allPathsCount(graph, 5, 1);
        // System.out.println(count1);
        // int v1 = 5;
        // ArrayList<Edge> graph2 = new ArrayList<>();
        // createBellmanGraph(graph2);
        // bellman(graph2, 0, v1);
        // createPrimGraph(graph);
        // System.out.println(prim(graph, 0));
        // int V = 4;
        // ArrayList<edgeKruskal> edges = new ArrayList<>();
        // KruskalGraph(edges);
        // kruskal(edges, V);
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createDijkstrarsGraph(graph);
        dijkstra(graph, 0);

            
        


        

    }
}