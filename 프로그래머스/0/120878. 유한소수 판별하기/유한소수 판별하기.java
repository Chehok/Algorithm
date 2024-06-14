class Solution {
    public int solution(int a, int b) {
        if(a > b) a %= b;
        int GCD = getGCD(a, b);
        b /= GCD;
        
        
        while(b != 1) {
            if(b % 2 == 0) b /= 2;
            else if(b % 5 == 0) b /= 5;
            else break;
        }
        
        return b == 1 ? 1 : 2;
    }
    public int getGCD(int a, int b) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % a;
        }
        
        return a;
    }
}