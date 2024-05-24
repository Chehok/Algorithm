class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < code.length() / q + 1; i++) {
            if(i * q + r > code.length() - 1) break;
            answer.append(code.charAt(i * q + r));
        }
        
        return answer.toString();
    }
}