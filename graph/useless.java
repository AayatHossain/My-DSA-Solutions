
//User function Template for Java

class Solution
{
     static class Edge{
        int s, d;
        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }

    public static void makeGraph(ArrayList<Edge> graph[], String[] dict){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }


        for(int i = 0; i < dict.length - 1 ; i++){
            String str1 = dict[i];
            String str2 = dict[i+1];
            for(int j = 0; j < Math.min(str1.length(), str2.length()); j++){
                char ch2 = str2.charAt(j);
                char ch1 = str1.charAt(j);
                if(str1.charAt(j) != str2.charAt(j)){
                    graph[ch1].add(new Edge(ch1, ch2));
                    break;
                }
            }
        }
    }


public static void calculateIndegree(ArrayList<Edge> graph[], int[] indeg) {

    
    for (int i = 0; i < graph.length; i++) {
        
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.d]++;
            }
        
    }
}


public static String topSort(ArrayList<Edge> graph[], int K, String str) {
    int indeg[] = new int[200];
    calculateIndegree(graph, indeg);
    Queue<Integer> q = new LinkedList<>();
    
    for (int i = 0; i < indeg.length; i++) {
        if (indeg[i] == 0) {
            q.add(i);
        }
    }

    int val = 97;
    for(int i = 1; i < K; i++){
        val = val + 1;
    }
    while (!q.isEmpty()) {
        int curr = q.remove();

        if (curr >= 'a' && curr <= val) {
            char a = (char) curr;
            str = str + a;  // Append the character to the string
        }
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge neighbor = graph[curr].get(i);
            indeg[neighbor.d]--;
            if (indeg[neighbor.d] == 0) {
                q.add(neighbor.d);
            }
        }
    }

    return str;
}
    
    public String findOrder(String [] dict, int N, int K)
    {
        ArrayList<Edge> graph[] = new ArrayList[200];
        makeGraph(graph, dict);
       
        String ans = "";

        return topSort(graph, K, ans);
        
        
    }
}