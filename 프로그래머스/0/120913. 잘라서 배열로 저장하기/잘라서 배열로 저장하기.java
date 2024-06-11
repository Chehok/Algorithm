import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        
        int i = 0;
        for(; i < my_str.length() / n; i++) {
            answer.add(my_str.substring(i * n, (i + 1) * n));
        }
        
        if(my_str.length() % n != 0) {
            answer.add(my_str.substring(i * n, my_str.length()));
        }
        
        return answer;
    }
}