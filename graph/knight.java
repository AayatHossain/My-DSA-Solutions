
import java.util.*;

public class knight {

    //this is not an array, so we are using the coordinates
    static class Coordinates{
        int x;
        int y;
        int steps;
        public Coordinates(int x, int y, int s){
            this.x = x;
            this.y = y;
            this.steps = s;
        }
    }


    public static void main(String args[]){
            int[] KnightPos = {4,5};
            int[] TargetPos = {1,1};
            int N = 6;


            //our indexing is 0 based, but information is given on 1 index based. So we are subtracting 1 index.
            KnightPos[0]--;
            KnightPos[1]--;
            TargetPos[0]--;
            TargetPos[1]--;
            

            //dx[0] and dx[y] together completes a knights single move. there are 8 knight moves in a chess board.
            int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
            int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
            


           
            //currently marking all the cells as false.
            boolean vis[][] = new boolean[N][N];
            
            //queue for storing visited cells by knight in board and steps taken. A crucial point is: the steps are arranged in increasing order 1---1---1----2----2----3-----3-----
            //So till we find the solution, the minimum steps are already achieved.
            Queue<Coordinates> q = new LinkedList<>(); 

            
            //pushing starting position of knight with 0 distance.
            q.add(new Coordinates(KnightPos[0], KnightPos[1], 0));
            //marking starting cell as visited.
            vis[KnightPos[0]][KnightPos[1]] = true;
            
            while(!q.isEmpty())
            {
                //pulling front Pair(x, y, steps)
                Coordinates curr = q.remove();
                //if we reach the required cell, we return true.
                if(curr.x == TargetPos[0] && curr.y == TargetPos[1])
                    System.out.println(curr.steps);


                //MOST IMPORTANT PART
                
                //using loop to reach all the cells that can be reached by knight.

                //we find out all 8 moves by the knight. we mark them as visited. because, after a new pair is pulled from queue, it will also have 8 moves and there will be some common 
                //position marked visit by the previous pair. the moves among the further 8 moves which are not common, will be made visited and  added to the Queue. 
                
                //from the current knight, all possible moves is possible with 1 step, so we increase the step by 1. in the first case, its : curr.steps+1 = 0+1 = 1.
                //when the next knight is called, we will mark its moves with curr.steps+1


                //Confusion comes in the matter how the knight moves only downwards? the answer is the knight moves both down and upwards
                //the queue may bring a pair which is upward the current knight. but it doesnt matter. The knights with least steps are always called first.
                //so, if a step 1 knight reaches target first, we will get step 1. Similarly,  if a step 10 knight reaches target first, we will get step 10.
                //So basically this is a BFS fashion.
                for(int i=0; i<8; i++)
                {
                    int n_x = curr.x + dx[i];
                    int n_y = curr.y + dy[i];
                    
                    //if cell indexes are valid and cell is not visited, we push  
                    //the indexes in queue with steps and mark cell as visited.
                    if(n_x >= 0 && n_x < N && n_y >= 0 && n_y < N && !vis[n_x][n_y])
                    {
                        
                        q.add(new Coordinates(n_x, n_y, curr.steps+1));
                        vis[n_x][n_y] = true;
                    }
                }


            }
           
        }
    }

