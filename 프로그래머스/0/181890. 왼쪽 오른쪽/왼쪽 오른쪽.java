import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        for(int i = 0; i < str_list.length; i++) {
            String s = str_list[i];
            
            if(s.equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, i);
                break;
            }
            if(s.equals("r")) {
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                break;
            }
        }
        
        return answer;
    }
}