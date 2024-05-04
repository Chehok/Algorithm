class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(i = i; i <= j; i++) {
            for(char c: String.valueOf(i).toCharArray()) {
                if(c - '0' == k) answer++;
            }
        }
        
        return answer;
    }
}