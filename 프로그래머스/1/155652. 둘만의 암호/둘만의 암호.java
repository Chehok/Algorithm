class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
                
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for(int j = 0; j < index; j++) {
                ++c;
                if(c > 'z') c -= 26;
                
                if(skip.contains(c + "")) j--;
            }
            answer.append(c);
        }
        
        return answer.toString();
    }
}