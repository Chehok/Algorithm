class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i+=2) {
            answer[i] = strArr[i].toLowerCase();
        }
        for(int i = 1; i < len; i+=2) {
            answer[i] = strArr[i].toUpperCase();
        }
        
        return answer;
    }
}