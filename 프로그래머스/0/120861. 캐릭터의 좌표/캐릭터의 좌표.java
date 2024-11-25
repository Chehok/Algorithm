class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[] {0, 0};
        
        for(int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                answer[1]++;
            } else if (keyinput[i].equals("down")) {
                answer[1]--;
            } else if (keyinput[i].equals("right")) {
                answer[0]++;
            }  else if (keyinput[i].equals("left")) {
                answer[0]--;
            }
            
            for(int j = 0; j < answer.length; j++) {
                if(answer[j] > board[j] / 2) {
                    answer[j] = board[j] / 2;
                } else if (answer[j] < -(board[j] / 2)) {
                    answer[j] = -(board[j] / 2);
                }
            }
        }
        
        return answer;
    }
}