import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0;
        
        for(String str: goal) {
            if(i < cards1.length && cards1[i].equals(str)){
                i++;
                continue;
            }
            if(j < cards2.length && cards2[j].equals(str)){
                j++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}