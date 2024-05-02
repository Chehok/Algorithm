class Solution {
    public String[] solution(String[] names) {
        int arrLen = names.length;
        int len = arrLen / 5;
        if(arrLen % 5 != 0) len++;
        String[] answer = new String[len];
        
        int idx = 0;
        for(int i = 0; i < arrLen; i += 5) {
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}