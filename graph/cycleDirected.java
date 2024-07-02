
//https://www.geeksforgeeks.org/detect-cycle-in-a-graph/

import java.util.ArrayList;
import java.util.List;

public class cycleDirected {
     boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack,
                         ArrayList<ArrayList<Integer>> adj) {

        //BASE CASE 1 - STACK E VERTEX ACHE MEANS CYCLE
        if (recStack[i]) return true;
        //BASE CASE 2 - STACK E VERTEX NAI PLUS VERTEX VISITED, MANE THERE IS NO CYCLE
        if (visited[i]) return false;

        // marking the current node as visited and part of recursion stack.
        visited[i] = true;
        recStack[i] = true;
        //DRAGGING ALL THE NEIGHIBORS
        List<Integer> children = adj.get(i);

        // calling function RECURSIVELY for all the NEIGHBORS
        // adjacent to this vertex.
        for (Integer c : children)
            if (isCyclicUtil(c, visited, recStack, adj)) return true;

        // removing the vertex from recursion stack IF THE VERTEX DOESNT MAKE A CYCLE
        recStack[i] = false;
        // THE VERTEX DOESNT MAKE A CYCLE, SO RETURN FALSE IN THE END
        return false;
    }

    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        //           5
        //     1   3   4        5 is directing to 3, so 345 is a cycle. 0-->1-->3-->4--->5--->3
        // 0                                                            0-->2
        //     2



        // marking all vertices as not visited and not a part of recursion stack
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        // calling the recursive helper function to detect cycle in
        // different DFS trees. EKTA GRAPH E ONEK SUB GRAPH THAKE, SO SHOB VERTEX VISIT KORA MANEI SHOB SUBGRAPH VISIT KORA.
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack, adj)) return true;

        return false;
    }
}
