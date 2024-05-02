class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        char chk = alp.charAt(0);
        
        for(char c: my_string.toCharArray()) {
            if(c == chk) {
                answer.append((char) (c + 'A' - 'a'));
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}