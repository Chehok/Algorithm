import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i])
                list.add(new int[] {rank[i], i});
        }
        
        Collections.sort(list, (o1, o2) -> (o1[0] - o2[0]));
        
        answer += list.get(0)[1] * 10000;
        answer += list.get(1)[1] * 100;
        answer += list.get(2)[1];
        
        return answer;
    }
}