import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(String s: operations) {
            StringTokenizer st = new StringTokenizer(s);
            
            String temp = st.nextToken();
            if(temp.equals("I")) {
                q1.add(Integer.valueOf(st.nextToken()));
            } else if (temp.equals("D")) {
                if(q1.isEmpty()) continue;
                temp = st.nextToken();
                
                if(temp.equals("-1")) {
                    q1.poll();
                } else if (temp.equals("1")){
                    while(!q1.isEmpty() && q1.size() > 1) {
                        q2.add(q1.poll());
                    }
                    q1.poll();
                    while(!q2.isEmpty()) {
                        q1.add(q2.poll());
                    }
                }
            }
        }
        
        if(!q1.isEmpty()) answer[1] = 1_000_000;
        
        while(!q1.isEmpty()) {
            int now = q1.poll();
            answer[0] = Math.max(answer[0], now);
            answer[1] = Math.min(answer[1], now);
        }
        
        return answer;
    }
}