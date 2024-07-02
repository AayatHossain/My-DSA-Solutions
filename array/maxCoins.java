https://leetcode.com/problems/maximum-number-of-coins-you-can-get/https://leetcode.com/problems/maximum-number-of-coins-you-can-get/

//After sorting the array, the last[n-1] max one will be picked my alice, second last one will be picked by me, bob will not pick the next max,  he will pick the next least[0] from the beginning
//i is for bob, k is for me. k is movved behind by 2 space, because 1 space is for alice. i is moved for 1 space because alice and me are pickiing from the end. dry run for better understanding.


class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int i = 0;
        int k = n-2;
        int cost = 0;
        while(i < k){
            cost += piles[k];
            k = k - 2;
            i++;
        }
        return cost;

    }
}