class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(char c: number.toCharArray()) {
            answer += Integer.valueOf(c) - '0';
        }
        
        return answer % 9;
    }
}