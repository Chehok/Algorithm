class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        boolean[] chk = new boolean[91];
        
        for(char c: my_string.toCharArray()) {
            if(!chk[c - ' ']) {
                chk[c - ' '] = true;
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}