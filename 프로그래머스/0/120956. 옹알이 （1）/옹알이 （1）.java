class Solution {
    public int solution(String[] babbling) {
        String[] temp = { "aya", "ye", "woo", "ma" };
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            for(String s: temp) {
                babbling[i] = babbling[i].replaceAll(s, "_");
            }
        }
        
        loop:
        for(int i = 0; i < babbling.length; i++) {
            for(char c: babbling[i].toCharArray()) {
                if(c != '_') continue loop;
            }
            answer++;
        }
        
        return answer;
    }
}