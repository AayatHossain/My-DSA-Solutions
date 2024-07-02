//main logic, consecutive rows will have beams if there is no device between them, like row 1 and 2 will have beams, and row 1 and 3 will not because row 2 has devices
//suppose row 1 and 3 have devices, but row 2 doesnt, in that case 1 and 3 will also have beam\
//multiplying device of row 1 with row 2 will give use total beams


//at first we store the count of devices in a count array
//then we travers through it an multiply.





class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int count[] = new int[n];
        for(int i = 0; i < n; i++){
            String str = bank[i];
            int count1 = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j)=='1'){
                    count1++;
                }
            }
            //counting devices for each row
            count[i] = count1;
        }
        

        //using two pointers to count.
        int i = 0;
        int j = 1;
        int total = 0;
        while(i<n && j<n){
            if(count[i]==0){
                i++;
            }else if(count[j]==0){
                j++;
            }else if(i==j){
                j++;
            }
            else{
                total += count[i]*count[j];
                i=j;
                j++;
            }
        }


        return total;
    }
}