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
            babbling[i] = babbling[i].replaceAll("_", "");
        }
        
        for(String b: babbling) {
            if(b.length() == 0) answer++;
        }
        
        return answer;
    }
}