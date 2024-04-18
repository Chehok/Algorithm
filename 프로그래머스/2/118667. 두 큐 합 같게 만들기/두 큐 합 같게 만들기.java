import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int answer = 0;
        long sum1 = 0;
        long sum2 = 0;
        int max = 0;
        
        for(int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            max = queue1[i] > max ? queue1[i] : max;
            max = queue2[i] > max ? queue2[i] : max;
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        
        if((sum1 + sum2) / 2 < max) return -1;
        
        while (sum1 != sum2) {
            if(sum1 < sum2) {
                sum1 += q2.peek();
                sum2 -= q2.peek();
                q1.add(q2.poll());
            } else {
                sum2 += q1.peek();
                sum1 -= q1.peek();
                q2.add(q1.poll());
            }
            answer++;
            if(answer > (queue1.length + queue2.length) * 2)  return -1;
        }
        
        return answer;
    }
}