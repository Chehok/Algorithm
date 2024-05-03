class Solution {
    public int[] solution(int[] num_list, int n) {
        int arrLen = num_list.length;
        int len = arrLen / n;
        if(arrLen % n != 0) len++;
        
        int[] answer = new int[len];
        
        int idx = 0;
        for(int i = 0; i < arrLen; i += n) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}