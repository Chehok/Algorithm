class Solution {
    public int solution(int[][] triangle) {
        int[][] answer = new int[triangle.length][triangle.length];
        int max = 0;
        
        answer[0][0] = triangle[0][0];
        
        for(int i = 0; i < triangle.length - 1; i++) {
            for(int j = 0; j <= i; j++) {
                for(int k = 0; k < 2; k++) {
                    answer[i + 1][j + k] = Math.max(answer[i + 1][j + k], answer[i][j] + triangle[i + 1][j + k]);
                }
            }
        }
        
        for(int a: answer[answer.length - 1]) {
            max = Math.max(max, a);
        }
        
        return max;
    }
}