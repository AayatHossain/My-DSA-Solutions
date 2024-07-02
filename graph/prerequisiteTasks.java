
class Solution {
    
        static class Edge {
        int dst;

        public Edge(int dst) {
            this.dst = dst;
        }
    }

    public static void makeGraph(int N, int[][] prerequisites, ArrayList<Edge>[] graph) {
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            graph[prerequisite[0]].add(new Edge(prerequisite[1]));
        }
    }

    public static boolean canFinish(int N, int[][] prerequisites) {
        ArrayList<Edge>[] graph = new ArrayList[N];
        makeGraph(N, prerequisites, graph);
        boolean[] visited = new boolean[N];
        boolean[] inStack = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (!visited[i] && !dfs(graph, i, visited, inStack)) {
                return false; // Cycle detected
            }
        }

        return true; // No cycle detected, all tasks can be finished
    }

    private static boolean dfs(ArrayList<Edge>[] graph, int v, boolean[] visited, boolean[] inStack) {
        visited[v] = true;
        inStack[v] = true;

        for (Edge neighbor : graph[v]) {
            int nextTask = neighbor.dst;

            if (!visited[nextTask]) {
                if (!dfs(graph, nextTask, visited, inStack)) {
                    return false;
                }
            } else if (inStack[nextTask]) {
                return false; // Cycle detected
            }
        }

        inStack[v] = false; // Backtrack: remove the current task from the stack
        return true;
    }
    
    
    public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        return canFinish(N, prerequisites);
    }
    
}