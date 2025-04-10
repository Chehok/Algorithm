class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        loop: 
        for(int i = 0; i < schedules.length; i++) {
            int schedule = schedules[i] + 10;
            if(60 <= schedule % 100) schedule += 40;
            
            for(int j = 0; j < timelogs[i].length; j++) {
                 // 토, 일은 패스
                int day = (j + startday - 1) % 7 + 1;
                if(day == 6 || day == 7) continue;
                
                if(schedule < timelogs[i][j]) continue loop;
            }
            answer++;
        }
        
        return answer;
    }
}