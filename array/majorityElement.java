
class Solution
{
    static int majorityElement(int a[], int size)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++){
            max = Math.max(max, a[i]);
        }
        int count[] = new int[max+1];
        for(int i = 0; i < size; i++){
            count[a[i]]++;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > size/2){
                return i;
            }
        }
        return -1;
        
        
    }
}