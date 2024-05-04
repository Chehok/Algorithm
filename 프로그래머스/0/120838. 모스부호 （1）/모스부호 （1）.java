class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        StringBuilder answer = new StringBuilder();
        
        for(String s: letter.split(" ")) {
            for(int i = 0; i < 26; i++) {
                if(s.equals(morse[i]))
                    answer.append((char) (i + 'a'));
            }
        }
        
        return answer.toString();
    }
}