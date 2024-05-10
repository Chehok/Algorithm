import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "a|b|c");
        List<String> answer = new ArrayList<>();
        
        if(!st.hasMoreTokens()) answer.add("EMPTY");
            
        while(st.hasMoreTokens()) {
            answer.add(st.nextToken());
        }
        
        return answer;
    }
}