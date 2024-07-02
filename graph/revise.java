import java.util.*;

public class revise{
    public static boolean DFS(ArrayList<ArrayList<Integer>> adj, boolean visit[], int v){
        if(visit[v]){
            return true;
        }
        visit[v] = true;
        for(int i = 0; i < adj.get(v).size(); i++){
            int destination = adj.get(v).get(i);
            DFS(adj, visit, destination);
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V;
        for(int i = 0; i < adj.size(); i++){
            if(dfs(adj, new boolean[V], 0)){
                return true;
            }
        }
        return false;
    }
}



