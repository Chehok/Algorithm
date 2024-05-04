import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(String str: intStrs) {
            StringBuilder sb = new StringBuilder();
            for(int i = s; i < s + l; i++) {
                sb.append(str.charAt(i));
            }
            
            int result = Integer.valueOf(sb.toString());
            
            if(result > k) answer.add(result);
        }
        
        return answer;
    }
}