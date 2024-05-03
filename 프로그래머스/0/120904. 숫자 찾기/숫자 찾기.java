class Solution {
    public int solution(int num, int k) {
        int answer = 8;
        int len = String.valueOf(num).length();
        
        for(int i = 0; i < len; i++) {
            if(num % 10 == k) {
                answer = Math.min(answer, len - i);
            }
            num /= 10;
        }
        
        return answer == 8 ? -1 : answer;
    }
}