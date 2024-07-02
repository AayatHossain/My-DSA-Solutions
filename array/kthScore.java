https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/


class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;

        for(int m = 0; m < n-1; m++){
            for(int i = 0; i < n-m-1; i++){
                //for kth row, we are checking if the previous num is small, if its small, we swap the whole row
            if(score[i][k] < score[i+1][k]){
                for(int j = 0; j < score[i].length; j++){
                    int temp = score[i][j];
                    score[i][j] = score[i+1][j];
                    score[i+1][j] = temp;
                }
            }
            }
        }
        
        return score;
    }
}