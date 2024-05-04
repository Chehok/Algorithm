class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        
        loop:
        for(int i = 0; i < my_string.length(); i++) {
            for(int idx: indices) if(i == idx) continue loop;
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}