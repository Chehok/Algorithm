import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        
        int cnt = 0;
        
        for(char c: myString.toCharArray()) {
            if(c == 'x') {
                answer.add(cnt);
                cnt = 0;
                continue;
            }
            cnt++;
        }
        answer.add(cnt);
        
        return answer;
    }
}