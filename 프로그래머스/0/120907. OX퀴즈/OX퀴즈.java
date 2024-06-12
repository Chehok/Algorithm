class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].replaceAll("- -", "").replaceAll("\\+ ", "").replaceAll("- ", "-").split(" ");
            
            int x = Integer.parseInt(q[0]);
            int y = Integer.parseInt(q[1]);
            int z = Integer.parseInt(q[3]);
            
            if(x + y == z) answer[i] = "O";
            else answer[i] = "X";
        }
        
        return answer;
    }
}