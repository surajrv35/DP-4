// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maximalSquare(char[][] matrix) {
        //base case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        
        int m=matrix.length, n=matrix[0].length;
        int max=0;
        int[][] dp = new int[m][n];
        
        // for first row and first column the value itself goes to dp matrix
        for (int i=0;i<m;i++)
        {
            dp[i][0] = matrix[i][0] == '0' ? 0 : 1;
            max=Math.max(max, dp[i][0]);
        }
        for (int j=0;j<n;j++)
        {
            dp[0][j] = matrix[0][j] == '0' ? 0 : 1;
            max=Math.max(max, dp[0][j]);
        }
        
        //otherwise case
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j] == '1') {
                dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                max=Math.max(max, dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
