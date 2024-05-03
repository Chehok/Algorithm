import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        for(char c: my_string.toCharArray()) {
            if('0' <= c && c <= '9')
                answer.add(Integer.valueOf(c) - '0');
        }
        Collections.sort(answer);
        
        return answer;
    }
}