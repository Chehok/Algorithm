import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        
        int j = 0;
        for (int i = 1; i <= order.length; i++) {
            stk.push(i);

            while (!stk.isEmpty() && stk.peek() == order[j]) {
                stk.pop();
                j++;
                answer++;
            }
        }
        
        return answer;
    }
}