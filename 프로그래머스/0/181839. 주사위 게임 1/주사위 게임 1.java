class Solution {
    public int solution(int a, int b) {
        int oddCnt = 0;
        
        if(a % 2 != 0) oddCnt++;
        if(b % 2 != 0) oddCnt++;
        
        switch(oddCnt) {
            case 1:
                return 2 * (a + b);
            case 2:
                return a * a + b * b;
        }
        return Math.abs(a - b);
    }
}