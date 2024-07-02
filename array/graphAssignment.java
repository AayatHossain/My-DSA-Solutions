import java.util.*;

public class graphAssignment {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //taking the input of the number of vertex
        System.out.println("Enter the number of vertex: ");
        int vertex = sc.nextInt();
        sc.nextLine(); 

        //making the graph as a matrix.
        int graph[][] = new int[vertex][vertex];
        
        //taking input of the adjacent vertices of the current vertex.
        for(int i = 0; i < vertex; i++){
            System.out.println("Enter the adjacent vertices of "+i+" (Use space between the vertices and hit enter once done): ");
            
                //if after 1 2 3, enter is pressed, the loop will continue to the input taking of the next vertex.
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    continue;
                }
                

                // Splitting the input string into tokens
                String[] numbersAsString = input.split(" ");
        
                for (String numberStr : numbersAsString) {

                    // Each token is converted to an integer.
                    int number = Integer.parseInt(numberStr);
                            
                    //for current vertex i, if the adjacent vertex is j, we mark the index graph[i][j] = 1 because there is a connection between them.
                    for(int j = 0; j < graph[i].length; j++){
                        if(j==number){
                            //change condition here if undirected graph is required.graph[j][i] = 1, ulta tao hobe current tar shathe.
                            graph[i][j] = 1;
                        }
                    }
                }
        }

        //finally printing the graph.
        System.out.println("The graph is: ");
        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

    }
}
