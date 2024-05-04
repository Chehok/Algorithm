class Solution {
    public String solution(String s) {
        int[] cnt = new int[26];
        StringBuilder answer = new StringBuilder();
        
        for(char c: s.toCharArray()) {
            cnt[c - 'a']++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(cnt[i] == 1) {
                answer.append((char) ('a' + i));
            }
        }
        
        return answer.toString();
    }
}