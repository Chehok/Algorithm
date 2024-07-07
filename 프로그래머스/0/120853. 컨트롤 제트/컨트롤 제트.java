class Solution {
    public int solution(String s) {
        int answer = 0;
        int recent = 0;
        
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++) {
            try {
                recent = Integer.parseInt(str[i]);
                answer += recent;
            } catch (Exception e) {
                answer -= recent;
            }
        }
        
        return answer;
    }
}