import java.util.*;
// https://practice.geeksforgeeks.org/problems/minimum-time-taken-by-each-job-to-be-completed-given-by-a-directed-acyclic-graph/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
public class minTimeJob {
        static class Edge{
        int s, d;
        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }

    static class Pair{
        int vertex, time;
        public Pair(int vertex, int time){
            this.vertex = vertex;
            this.time = time;
        }
    }

    public static void makeGraph(ArrayList<Edge> graph[], int[][] edges){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < edges.length; i++){
            //size is 10. but 0 to 10 becomes 11 size. so index out of bounds will happen
            //thats why, values are subtracted by 1. 1 becomes 0, 2 becomes 1......10 becomes 9. so 0 to 9 becomes size 10.
            graph[edges[i][0]-1].add(new Edge(edges[i][0]-1, edges[i][1]-1));
        }
    }
    public static void calcIndegree(ArrayList<Edge> graph[], int indegree[]){
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].size(); j++){
                Edge e = graph[i].get(j);
                indegree[e.d]++;
            }
        }
    }

    public static int[] order(ArrayList<Edge> graph[], int[] ans, int n){
        int[] indegree = new int[n];
        //Job and its time to complete is stored in the Pair and queue.
        Queue<Pair> q = new LinkedList<>();
        calcIndegree(graph, indegree);
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i]==0){
                //0 indegree means not dependent, so it is completed first. So, time required is 1.
                q.add(new Pair(i, 1));
            }
        }

    
        while(!q.isEmpty()){
            Pair curr = q.poll();
            //add the time to the job.
            ans[curr.vertex] = curr.time;
            //traverse neighbors and reduce indegree
            for(int i = 0; i < graph[curr.vertex].size(); i++){
                Edge e = graph[curr.vertex].get(i);
                indegree[e.d]--;
                //if indegree is 0, it means there is no dependency, so add it to the queue.
                if(indegree[e.d]==0){
                    //add 1 with the current time, because present time is curr.time, for next job, time needed is curr.time+1;
                    q.add(new Pair(e.d, curr.time+1));
                }
            }
            
        }
        return ans;
    }

    public static void main(String args[]){
        int n = 10;
        int[][] edges = {{1,3},{1,4},{1,5},{2,3},{2,8},{2,9},{3,6},{4,6},{4,8},{5,8},{6,7},{7,8},{8,10}};
        ArrayList<Edge> graph[] = new ArrayList[n];
        makeGraph(graph, edges);
        int[] ans = order(graph, new int[n], n);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
