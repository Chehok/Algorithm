class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if('0' <= c && c <= '9') {
                temp.append(c);
            } else {
                if(temp.length() != 0) {
                    answer += Integer.valueOf(temp.toString());
                    temp.setLength(0);
                }
            }
        }
        
        if(temp.length() != 0) 
            answer += Integer.valueOf(temp.toString());
        
        return answer;
    }
}