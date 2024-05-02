class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int div = 100_000;
        int remain = n;
        for(int i = 0; i < 6; i++) {
            answer += remain / div;
            remain %= div;
            div /= 10;
        }
        
        return answer;
    }
}