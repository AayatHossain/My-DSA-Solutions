
class Solution {
    // Function to check for a cycle in an undirected graph
    Boolean checkForCycle(int node, int parent, boolean vis[], ArrayList<ArrayList<Integer>> adj) {
        // Mark the current node as visited
        vis[node] = true; 
        
        // Traverse through all adjacent nodes, like adjacent of 0 is 1 and 2.
        for(Integer it: adj.get(node)) {
            // If the adjacent node is not visited, recursively check for a cycle. meaning call 1, 3, 4, 2 and so on.
            if(vis[it] == false) {
                //here, 0 is put as parent, and 1 as node.
                if(checkForCycle(it, node, vis, adj) == true) 
                    return true; 
            }
            // If the adjacent node is visited and not the parent of the current node, there is a cycle
            //Meaning, parent of 2 is 4, 2 has neighbors 0 and 4, 0 is visited, plus its not equal to parent.
            // So we are not going towards parent but towards a previous node which is 0.
            //thats why a cycle is created.
            else if(it!=parent) 
                return true; 
        }
        
        // If no cycle is found in the whole DFS traversal, return false
        return false; 
    }

    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {


        //                         1 ----- 3
        // USE THIS GRAPH        /            \
        //                     0           |   \------5  -----  6        7---8
        //                       \            /                           \ /
        //                         2 ----- 4/                              9


        boolean vis[] = new boolean[V];
        
        // Iterate through all vertices of the graph. meaning there can be many sub graph in a problem, so traverse through all.
        for(int i = 0;i<V;i++) {
            //SPECIAL CONDITION FOR UNDIRECTED, NOT USED IN DIRECTED GRAPHS.
            if(vis[i] == false) {
                if(checkForCycle(i, -1, vis, adj))
                    return true; 
            }
        }
        
        // If no cycle is found in any vertex, return false
        return false; 
    }
}