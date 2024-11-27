class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int GCD = getGCD(denom1, denom2);
        
        answer[0] = (numer1 * denom2 + numer2 * denom1) / GCD;
        answer[1] = denom1 * denom2 / GCD;
        
        GCD = getGCD(answer[0], answer[1]);
        
        answer[0] /= GCD;
        answer[1] /= GCD;
        
        return answer;
    }
    
    // a를 더 크게
    int getGCD(int a, int b) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        while(true) {
            int temp = a % b;
            if(temp == 0) {
                return b;
            }
            
            a = b;
            b = temp;
        }
    }
}