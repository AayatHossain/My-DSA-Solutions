import java.util.Arrays;
import java.util.Scanner;

public class one {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int tc = sc.nextInt();
        // for(int j = 0; j < tc; j++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double l = sc.nextDouble();
            int count = 0;
            for(int k = 1; k <= l; k++){
                double quotient = l/k;
                if(quotient % (a*b) == 0){
                    
                    continue;
                }
                if(quotient % a == 0 || quotient % b == 0){
                    count++;
                }
            }
            System.out.println(count);
            
        // }
        sc.close();
        }
        
        
}
