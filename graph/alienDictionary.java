import java.util.*;
public class alienDictionary {

    static class Edge{
        int s, d;
        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }

    //two characters of the two strings are compared simulatenously, 
    //if at any point, ch1 and ch2 is different, there will be an Edge ch1---->>ch2. Meaning ch1 is smaller than ch2
    //this is because the words are arranged lexographically
    //lexographically arranged meaning, the words are sorted. if the first words of both string are same, but the last one ch4 and ch5 are different,
    //it means that ch4 is smaller than ch5. For example-  abcd
                                                        // abca . Here, a, b, c, are same in both the strings, but 'd' and 'a' at the end are different, so d---->a
    public static void makeGraph(ArrayList<Edge> graph[], String[] dict){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }


        for(int i = 0; i < dict.length - 1 ; i++){
            String str1 = dict[i];
            String str2 = dict[i+1];
            //we will only iterate trough the smaller lenght between two strings. otherwise index error.
            for(int j = 0; j < Math.min(str1.length(), str2.length()); j++){
                char ch2 = str2.charAt(j);
                char ch1 = str1.charAt(j);
                if(str1.charAt(j) != str2.charAt(j)){
                    graph[ch1].add(new Edge(ch1, ch2));
                    //as soon as the difference is found, we will break, because we dont need to check further
                    break;
                }
            }
        }
    }


public static void calculateIndegree(ArrayList<Edge> graph[], int K, int[] indeg) {

    
        for (int i = 0; i < graph.length; i++) {
            
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    //we are increasing the indegree of the neighbors because they are coming from a source.
                    indeg[e.d]++;
                }
            
        }
}


//topological sort concept. we print a vertex with 0 indegrees, then we go to the neighbors, we reduce the
//neighbor indegrees by 1, because the source is removed from the queue. if after reducing the indegree, if 
//the indegree of any neighbor is 0, we add it immediately to the queue. Because we need 0 indegrees to print.

public static String topSort(ArrayList<Edge> graph[], int K, String str) {
    //200 size because a b c d are 97 98 99 100 etc. So 200 is the safe option
    int indeg[] = new int[200];
    calculateIndegree(graph, K, indeg);
    Queue<Integer> q = new LinkedList<>();
    
    //if indegree is 0, add the character.
    for (int i = 0; i < indeg.length; i++) {
        if (indeg[i] == 0) {
            q.add(i);
        }
    }

    //finding abcd etc. according to K. As K = 4 here, we incremented 4 times and got abcd. value of a is 97.
    //we are performing operations according to integer not characters, because its easier.
    int val = 97;
    for(int i = 1; i < K; i++){
        val = val + 1;
    }
    while (!q.isEmpty()) {
        int curr = q.remove();
        //there might e several characters like jhkjhfd which are not abcd. So we only print our required abc or abcdef according to K.
        if (curr >= 'a' && curr <= val) {
            //we transform the int into character before adding to the string
            char a = (char) curr;
            str = str + a;  // Append the character to the string
        }
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge neighbor = graph[curr].get(i);
            //the source is removed, so Indegree of the neighbors of that particular source will be reduced by 1. in this way, indegree is reduced to 0 for every case.
            indeg[neighbor.d]--;
            //as soon as the indegree becomes 0, we add the neighbor to our queue, cuz we are printing 0 indegrees.
            if (indeg[neighbor.d] == 0) {
                q.add(neighbor.d);
            }
        }
    }

    return str;
}

        
    

    public static void main(String args[]){
        String[] dict =  {"baa","abcd","abca","cab","cad"};
        int N = 5;
        int K = 4;
        
         //200 size because a b c d are 97 98 99 100 etc. So 200 is the safe option
        ArrayList<Edge> graph[] = new ArrayList[200];
        makeGraph(graph, dict);
       
        String ans = "";

        System.out.println(topSort(graph, K, ans));
        





    }
}
