class Solution {
    public int solution(int[][] dots) {
        double x1;
        double x2;
        double y1;
        double y2;
        
        x1 = Math.abs(dots[0][0] - dots[1][0]);
        y1 = Math.abs(dots[0][1] - dots[1][1]);

        x2 = Math.abs(dots[2][0] - dots[3][0]);
        y2 = Math.abs(dots[2][1] - dots[3][1]);

        if(x1 / y1 == x2 / y2) return 1;
        
        x1 = Math.abs(dots[0][0] - dots[2][0]);
        y1 = Math.abs(dots[0][1] - dots[2][1]);

        x2 = Math.abs(dots[1][0] - dots[3][0]);
        y2 = Math.abs(dots[1][1] - dots[3][1]);

        if(x1 / y1 == x2 / y2) return 1;
        
        x1 = Math.abs(dots[0][0] - dots[3][0]);
        y1 = Math.abs(dots[0][1] - dots[3][1]);

        x2 = Math.abs(dots[1][0] - dots[2][0]);
        y2 = Math.abs(dots[1][1] - dots[2][1]);

        if(x1 / y1 == x2 / y2) return 1;
        
        return 0;
    }
}