class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char c: my_string.toCharArray()) {
            if('a' <= c && c <= 'z') {
                answer.append(String.valueOf(c).toUpperCase());
            } else {
                answer.append(String.valueOf(c).toLowerCase());
            }
        }
        
        return answer.toString();
    }
}