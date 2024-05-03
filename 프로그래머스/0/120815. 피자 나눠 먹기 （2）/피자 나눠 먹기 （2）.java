class Solution {
    public int solution(int n) {
        int div = getDivisor(n, 6);
        return n / div;
    }
    
    public int getDivisor(int a, int b) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        while(a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
