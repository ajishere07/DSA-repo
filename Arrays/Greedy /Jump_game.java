
//55. Jump Game
//Easy

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxIndex = 0;
        for(int i = 0 ; i<n; i++){
            if(i > maxIndex) return false; // current index beyond the farthest jump , if yes return false.
            maxIndex = Math.max(maxIndex, i+nums[i]); // storing the farthest jump from current position
        }

        return true;
    }
}




/* 
Summary
The Jump Game problem gives you an array where each element represents the maximum number of steps you can jump forward 
from that position. You start at the first index, and your goal is to determine whether it’s possible to reach the last 
index of the array by jumping forward according to these values.

The easiest way to solve this is using a greedy approach. Keep track of the farthest index you can reach as you move
from left to right. If at any point the current index is greater than the farthest reachable index, you are stuck and 
must return false. If you can go through the entire array without getting stuck, then reaching the last index is possible, so return true.

One-line memory trick

Always track the farthest you can reach. If you ever can’t reach the current index, you lose.

*/
