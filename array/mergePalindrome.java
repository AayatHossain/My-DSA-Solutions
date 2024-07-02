public class mergePalindrome {
    public static void main(String args[]){
        int a[] = {1, 4, 5, 1};

        int i = 0, j = a.length-1, count = 0;
        while(i < j){
            if(a[i]==a[j]){
                i++;
                j--;
                continue;
            }else{
                a[i+1] = a[i]+a[i+1];
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}
