import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Queue<int[]> pq = 
            new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        
        for(int i = 0; i < emergency.length; i++) {
            pq.add(new int[] {emergency[i], i});
        }
        
        int num = 1;
        while(!pq.isEmpty()) {
            answer[pq.poll()[1]] = num++;
        }
        
        return answer;
    }
}