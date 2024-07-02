
//BFS
class Solution {
    
        public static void BFS(int n, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[n];
        q.add(0);
        while(!q.isEmpty()){
            int v = q.poll();
            if(!visit[v]){
                visit[v] = true;
                ans.add(v);
                for(int i = 0; i < adj.get(v).size(); i++ ){
                    int neighbor = adj.get(v).get(i);
                    q.add(neighbor);
                }
            }
        }
    }
  
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        BFS(V, ans, adj);
        return ans;
    }
}
//BFS








//DFS
class Solution {
    public static void DFS(int src, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj, boolean visit[]){
        if(visit[src]){
            return;
        }
        ans.add(src);
        visit[src] = true;
        for(int i = 0; i < adj.get(src).size(); i++){
            int neighbor = adj.get(src).get(i);
            DFS(neighbor, ans, adj, visit);
        }
    }
    
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        DFS(0, ans, adj, new boolean[V]);
        return ans;
    }
}
//DFS