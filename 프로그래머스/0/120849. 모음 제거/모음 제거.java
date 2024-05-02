class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] aeiou = { 'a', 'e', 'i', 'o', 'u' };
        
        loop:
        for(char c: my_string.toCharArray()) {
            for(char temp: aeiou) {
                if(c == temp) continue loop;
            }
            answer.append(c);
        }
        
        return answer.toString();
    }
}