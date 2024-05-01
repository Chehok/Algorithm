class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        for(int i = 0; i < n; i++) {
            answer += 12000;
        }
        
        k -= n / 10;
        
        for(int i = 0; i < k; i++) {
            answer += 2000;
        }
        
        return answer;
    }
}