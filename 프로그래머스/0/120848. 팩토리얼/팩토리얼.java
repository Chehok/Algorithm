class Solution {
    public int solution(int n) {
        int factorial = 1;
        int answer = 0;
        
        for(int i = 1; i <= 10; i++) {
            factorial *= i;
            if(n < factorial) break;
            answer++;
        }
        
        return answer;
    }
}