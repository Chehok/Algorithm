class Solution {
    public int solution(String[] babbling) {
        String[] temp = { "aya", "ye", "woo", "ma" };
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            for(String s: temp) {
                babbling[i] = babbling[i].replaceAll(s, "_");
            }
        }
        
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].replaceAll("_", "").length() == 0) answer++;
        }
        
        return answer;
    }
}