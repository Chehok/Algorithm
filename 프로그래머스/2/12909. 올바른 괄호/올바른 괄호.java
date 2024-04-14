import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        for(int i = 0 ; i < s.length(); i ++) {
            if(s.charAt(i) == '(') {
                count++;
                continue;
            }
            if(count > 0) {
                count--;
                continue;
            }
            answer = false;
            break;
        }

        if(count != 0) answer = false;
        
        return answer;
    }
}