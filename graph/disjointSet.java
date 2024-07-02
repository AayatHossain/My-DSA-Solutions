import java.util.ArrayList;

public class disjointSet {

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


    public static void kruskal(ArrayList<Edges> edges , int V){
        
    }


    public static void main(String args[]){

    }

}
