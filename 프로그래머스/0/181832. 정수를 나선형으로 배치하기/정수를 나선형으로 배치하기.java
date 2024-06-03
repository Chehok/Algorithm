class Solution {
    public int[][] solution(int n) {
        int[][] pos = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int idx = 0;
        int x = 0;
        int y = 0;
        int[][] answer = new int[n][n];
        
        int cnt = 1;
        while (cnt <= n * n) {
            answer[x][y] = cnt++;
            
            int nextX = x + pos[idx][0];
            int nextY = y + pos[idx][1];
            if(nextX >= n || nextY >= n || nextX < 0 || nextY < 0 || answer[nextX][nextY] != 0) {
                idx++;
                if(idx > 3) idx = 0;
                nextX = x + pos[idx][0];
                nextY = y + pos[idx][1];
            }
            x = nextX;
            y = nextY;
        }
        
        return answer;
    }
}