import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s: operations) {
            StringTokenizer st = new StringTokenizer(s);
            
            String temp = st.nextToken();
            if(temp.equals("I")) {
                int val = Integer.valueOf(st.nextToken());
                q1.add(val);
                q2.add(val);
            } else if (temp.equals("D")) {
                if(q1.isEmpty()) continue;
                temp = st.nextToken();
                
                if(temp.equals("-1")) {
                    int min = q1.poll();
                    q2.remove(min);
                } else if (temp.equals("1")){
                    int max = q2.poll();
                    q1.remove(max);
                }
            }
        }
        
        if(!q1.isEmpty()) {
            answer[0] = q2.poll();
            answer[1] = q1.poll();
        }
        
        return answer;
    }
}