class Solution {
    static int[][] pos = {
        {-1, -1}, {-1, 0}, {-1, 1},
        { 0, -1}, { 0, 0}, { 0, 1},
        { 1, -1}, { 1, 0}, { 1, 1} };
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    for(int k = 0; k < 9; k++) {
                        int nextX = i + pos[k][0];
                        int nextY = j + pos[k][1];
                        if(0 <= nextX && 0 <= nextY && nextX < n && nextY < n && board[nextX][nextY] != 1){
                            board[nextX][nextY] = 2;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}