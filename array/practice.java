import java.util.*;

public class practice
{
	
	public static void main (String[] args)
	{
		
			int grid[][] = {{0,1,1},{1,0,1},{0,0,1}};

				int n = grid.length;
				int m = grid[0].length;
				for(int i = 0; i < n; i++){
					for(int j =  0; j < m; j++){
						int cO = 0;
						int cZ = 0;
						for(int k = 0; k < m; k++){
							if(grid[i][k] == 0){
								cZ++;
							}
							if(grid[i][k] == 1){
								cO++;
							}
						}
						for(int k = 0; k < n; k++){
							if(grid[k][j] == 0){
								cZ++;
							}
							if(grid[k][j] == 1){
								cO++;
							}
						}
						if(i==2 && j==2){
							System.out.println(cO);
							System.out.println(cZ);
						}
						int diff = cO - cZ;
						grid[i][j] = diff;
					}
				}

				// for(int i = 0; i < n; i++){
				// 	for(int j = 0; j < grid[i].length; j++){
				// 		System.out.print(grid[i][j]+" ");
				// 	}
				// 	System.out.println();
				// }
				
			}
	
}
