import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int a: arr) {
            if(stk.size() == 0) {
                stk.add(a);
            } else {
                while(stk.size() > 0) {
                    int temp = stk.get(stk.size() - 1);
                    if(temp < a) break;
                    stk.remove(stk.size() - 1);
                }
                stk.add(a);
            }
        }
        
        return stk;
    }
}