class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        
        for(char c: String.valueOf(age).toCharArray()) {
            answer.append((char) ('a' + Integer.valueOf(c) - '0'));
        }
        
        return answer.toString();
    }
}