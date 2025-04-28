class Solution
{
    public int solution(int [][]board)
    {
        int answer = -1;
        
        int[][] dp = new int[board.length + 1][board[0].length + 1];
        
        for(int i = 1; i <= board.length; i++){
            for(int j = 1; j <= board[0].length; j++){
                if(board[i-1][j-1] == 1){
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) + 1;
                }
                answer = Math.max(answer, dp[i][j]);
            }
        }
        
        return answer * answer;
    }
}