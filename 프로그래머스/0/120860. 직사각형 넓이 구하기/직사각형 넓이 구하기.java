class Solution {
    public int solution(int[][] dots) {
        int a = 0;
        int b = 0;
        int temp = 0;
        
        for(int i = 0; i < 2; i++) {
            temp = Math.abs(dots[i][0] - dots[i + 1][0]);
            a = a < temp ? temp : a;
            
            temp = Math.abs(dots[i][1] - dots[i + 1][1]);
            b = b < temp ? temp : b;
        }
        
        return a * b;
    }
}