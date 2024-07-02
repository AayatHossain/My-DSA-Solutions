UNOPTIMIZED
T = O(NLOGN/MLOGM)
S = O(N+M);

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int temp[] = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(a[i] < b[j]){
                temp[k] = a[i];
                k++;
                i++;
            }else{
               temp[k] = b[j];
                j++;
                k++;
        }
    }
 
        if(i >= n){
            while(j < m){
                temp[k] = b[j];
                k++;
                j++;
            }
        }
        if(j >= m){
            while(i < n){
                temp[k] = a[i];
                i++;
                k++;
                
                
            }
        }
        double median = 0;
        if((n+m) % 2 != 0){
            median = temp[(n+m)/2];
        }else{
            median = (double)(temp[(n+m)/2]+temp[((n+m)/2)-1])/2;
        }
        return median;
    }
}








OPTIMIZED
T= O(min(log n, log m));
S = O((n+m)/2);