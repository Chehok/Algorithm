class Solution {
    public int solution(int a, int b) {
        StringBuilder answer = new StringBuilder();
        answer.append(Integer.toString(a));
        answer.append(Integer.toString(b));
        return Math.max(2 * a * b, Integer.valueOf(answer.toString()));
    }
}