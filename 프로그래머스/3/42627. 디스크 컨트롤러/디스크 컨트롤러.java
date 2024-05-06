import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> q1 = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> q2 = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        for(int[] j: jobs) {
            q1.add(j);
        }
        
        int time = 0;
        while(!q1.isEmpty() || !q2.isEmpty()) {
            while(!q1.isEmpty() && q1.peek()[0] <= time) 
                q2.add(q1.poll());
            
            if(!q2.isEmpty()) {
                int[] temp = q2.poll();
                answer += time - temp[0] + temp[1];
                time += temp[1];
            } else {
                time++;
            }
        }
        
        return answer / jobs.length;
    }
}