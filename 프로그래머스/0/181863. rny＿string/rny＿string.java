class Solution {
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder();
        
        for(char c: rny_string.toCharArray()) {
            if(c == 'm') {
                answer.append('r');
                answer.append('n');
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}