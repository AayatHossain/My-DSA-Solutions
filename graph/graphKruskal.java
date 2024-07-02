import java.util.ArrayList;
import java.util.Collections;

public class graphKruskal {

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


    public static void main(String args[]){
        int V = 4;
        ArrayList<edgeKruskal> edges = new ArrayList<>();
        KruskalGraph(edges);
        kruskal(edges, V);
    }
}
