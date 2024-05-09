class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] maps = new int[m + 1][n + 1];
        maps[1][1] = 1;

        for(int i = 1; i < m + 1; i++) {
            loop: 
            for(int j = 1; j < n + 1; j++) {
                for(int[] p: puddles) {
                    if(i == p[0] && j == p[1]) continue loop;
                }
                
                maps[i][j] += (maps[i - 1][j] + maps[i][j - 1]) % 1_000_000_007;
            }
        }
        
        return maps[m][n] % 1_000_000_007; 
    }
}